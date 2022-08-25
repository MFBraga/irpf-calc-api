package mbraga.irpfcalcapi.restapi.model;

public class IrrfView {
    private double rate;
    private double irrf;
    
    public IrrfView() {
        super();
    }

    public IrrfView(double rate, double irrf) {
        this.rate = rate;
        this.irrf = irrf;
    }


    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }


    public double getIrrf() {
        return irrf;
    }
    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }   
    
}
