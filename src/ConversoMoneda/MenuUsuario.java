package ConversoMoneda;

import java.util.Scanner;

public class MenuUsuario {

    private CalDivisas conversor;
    private Scanner scanner;

        public MenuUsuario(CalDivisas conversor) {
            this.conversor = conversor;
            this.scanner = new Scanner(System.in);
        }

        public void mostrar() {
            int opcion = 0;

            while (opcion != 2) {
                System.out.println("╔═════════════════════╗");
                System.out.println("║  Conversor-Monedas  ║");
                System.out.println("╚═════════════════════╝");
                System.out.println("""
                1. Realizar conversión
                2. Salir
                """);

                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> ejecutarConversion();
                    case 2 -> System.out.println("¡Hasta pronto!");
                    default -> System.out.println("Opción no válida");
                }
            }
        }

        private void ejecutarConversion() {
            System.out.print("Ingrese monto a convertir: ");
            double monto = scanner.nextDouble();

            System.out.println("""
            Tipo de conversión:
            1. CLP a ARS
            2. ARS a CLP
            3. CLP a USD
            4. USD a CLP
        """);

            int tipo = scanner.nextInt();
            double resultado = 0;

            switch (tipo) {
                case 1 -> resultado = conversor.convertirClpAAgrs(monto);
                case 2 -> resultado = conversor.convertirAgrsAClp(monto);
                case 3 -> resultado = conversor.convertirClpAUsd(monto);
                case 4 -> resultado = conversor.convertirUsdAClp(monto);
                default -> {
                    System.out.println("Opción inválida.");
                    return;
                }
            }

            System.out.printf("Resultado: %.2f%n%n", resultado);
        }
    }

