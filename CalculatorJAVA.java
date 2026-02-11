package com.mycompany.calculatorjava;


public class CalculatorJAVA {

    private double numero1;
    private double numero2;

    // Constructor por defecto
    public CalculatorJAVA() {
        numero1 = 0;
        numero2 = 0;
    }

    // Metodo para ingresar numeros
    public void ingresarNumeros(double n1, double n2) {
        numero1 = n1;
        numero2 = n2;
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculatorJAVA calc = new CalculatorJAVA();
        int opcion = -1;

        do {
            System.out.println("\n===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");

            // Validacion de opcion
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
            } else {
                System.out.println("Entrada invalida.");
                sc.next();
                continue;
            }

            switch (opcion) {

                case 1 -> {
                    System.out.print("Ingrese el primer numero: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Entrada invalida.");
                        sc.next();
                    }
                    double n1 = sc.nextDouble();

                    System.out.print("Ingrese el segundo numero: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Entrada invalida.");
                        sc.next();
                    }
                    double n2 = sc.nextDouble();

                    calc.ingresarNumeros(n1, n2);
                    System.out.println("Numeros guardados correctamente.");
                }

                case 2 -> System.out.println("Resultado suma: " + calc.sumar());

                case 3 -> System.out.println("Resultado resta: " + calc.restar());

                case 4 -> System.out.println("Resultado multiplicacion: " + calc.multiplicar());

                case 5 -> System.out.println("Resultado division: " + calc.dividir());

                case 0 -> System.out.println("Gracias por usar la calculadora.");

                default -> System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}