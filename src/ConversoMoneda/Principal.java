package ConversoMoneda;


public class Principal {
    public static void main(String[] args) {
        CalDivisas conversor = new CalDivisas(123, 245, 567);
        MenuUsuario menu = new MenuUsuario(conversor);
        menu.mostrar();
    }
}





