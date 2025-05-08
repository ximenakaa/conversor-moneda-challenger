package ConversoMoneda;

public class DatosMoneda {
    /*Atributo*/
     double pesosCl;
     double pesosArg;
     double dolar;



    /*contructor*/
    public DatosMoneda(double pesosCl, double pesosArg, double dolar) {
        this.pesosCl = pesosCl;
        this.pesosArg = pesosArg;
        this.dolar = dolar;

    }
    /*metodo*/

    public double getPesosCl() {
        return pesosCl;
    }

    public void setPesosCl(double pesosCl) {
        this.pesosCl = pesosCl;
    }

    public double getPesosArg() {
        return pesosArg;
    }

    public void setPesosArg(double pesosArg) {
        this.pesosArg = pesosArg;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

}





