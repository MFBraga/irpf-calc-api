package mbraga.irpfcalcapi.application.abstractions;

public interface RateTable {
    double calculateInssValue(double salary);
    double calculateTaxLayer(double baseSalary);
}
