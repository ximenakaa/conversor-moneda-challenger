package ConversoMoneda;

public class CalDivisas {

         double pesosCl;
         double pesosArg;
         double dolar;

        // Constructor que recibe las tasas de cambio desde otra clase
        public CalDivisas(double pesosCl, double pesosArg, double dolar) {
                this.pesosCl = pesosCl;
                this.pesosArg = pesosArg;
                this.dolar = dolar;
        }

        // Métodos de conversión
        public double convertirClpAAgrs(double monto) {
                return monto * pesosArg / pesosCl;
        }

        public double convertirAgrsAClp(double monto) {
                return monto * pesosCl / pesosArg;
        }

        public double convertirClpAUsd(double monto) {
                return monto / dolar;
        }

        public double convertirUsdAClp(double monto) {
                return monto * dolar;
        }
}


