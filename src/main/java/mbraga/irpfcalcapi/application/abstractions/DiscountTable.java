package mbraga.irpfcalcapi.application.abstractions;

public interface DiscountTable {
    double calculateExemption();
    double calculateDependentsValue(int number);
}
