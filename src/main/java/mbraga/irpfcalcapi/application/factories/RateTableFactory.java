package mbraga.irpfcalcapi.application.factories;

import mbraga.irpfcalcapi.application.abstractions.RateTable;
import mbraga.irpfcalcapi.application.implementation.RateTable2021;

public abstract class RateTableFactory {
    public static RateTable build(int year) {
        if (year == 2021)
            return new RateTable2021();

        return null;
    }
}
