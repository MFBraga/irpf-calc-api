package mbraga.irpfcalcapi.application.factories;

import mbraga.irpfcalcapi.application.abstractions.DiscountTable;
import mbraga.irpfcalcapi.application.implementation.DiscountTable2021;

public abstract class DiscountTableFactory {
    public static DiscountTable build(int year) {
        if (year == 2021)
            return new DiscountTable2021();

        return null;
    }
}
