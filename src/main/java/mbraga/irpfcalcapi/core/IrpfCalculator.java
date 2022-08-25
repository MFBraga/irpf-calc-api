package mbraga.irpfcalcapi.core;

import mbraga.irpfcalcapi.application.abstractions.DiscountTable;
import mbraga.irpfcalcapi.application.abstractions.RateTable;
import mbraga.irpfcalcapi.application.factories.DiscountTableFactory;
import mbraga.irpfcalcapi.application.factories.RateTableFactory;
import mbraga.irpfcalcapi.domain.Person;

public class IrpfCalculator {
  private Person person;
  private RateTable rateTable;
  private DiscountTable discountTable;

  public IrpfCalculator(int year, Person person) {
    super();
    this.person = person;
    this.rateTable = RateTableFactory.build(year);
    this.discountTable = DiscountTableFactory.build(year);
  }

  public double calculateInssValue() {
    return this.rateTable.calculateInssValue(this.person.getTotalSalary());
  }

  public double calculateDependentsValue() {
    return this.discountTable.calculateDependentsValue(this.person.getDependents());
  }

  public double calculateBaseSalary() {
    return this.person.getTotalSalary() - this.calculateDependentsValue() - this.calculateInssValue();
  }

  public double calculateExemption() {
    return this.discountTable.calculateExemption();
  }

  public double calculateDiscount() {
    return this.calculateInssValue() + this.calculateExemption();
  }

  public double calculateTaxLayer(double baseSalary) {
    return this.rateTable.calculateTaxLayer(baseSalary);
  }

  public double calculate() {
    var salaryForIrpf = this.calculateBaseSalary() - this.calculateExemption();
    var taxValue = this.calculateTaxLayer(this.calculateBaseSalary());

    return salaryForIrpf * taxValue;
  }
}
