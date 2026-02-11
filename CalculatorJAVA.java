package com.mycompany.calculatorJAVA;
import java.util.Scanner;

/**
 * Clase CalculatorJAVA
 * Representa una calculadora matematica basica que permite
 * realizar operaciones aritmeticas con dos numeros.
 * 
 * Utiliza menu interactivo con estructura switch y ciclo do-while.
 * 
 * @author Luis E. Vargas
 */
public class CalculatorJAVA {

    // =========================
    // ATRIBUTOS PRIVADOS
    // =========================
    private double numero1;
    private double numero2;

    // =========================
    // CONSTRUCTOR POR DEFECTO
    // =========================

    /**
     * Inicializa los numeros en cero.
     */
    public CalculatorJAVA() {
        numero1 = 0;
        numero2 = 0;
    }

    // =========================
    // METODO PARA INGRESAR NUMEROS
    // =========================

    /**
     * Establece los valores de los dos numeros.
     * 
     * @param n1 Primer numero
     * @param n2 Segundo numero
     */
    public void ingresarNumeros(double n1, double n2) {
        numero1 = n1;
        numero2 = n2;
    }

    // =========================
    // METODOS MATEMATICOS
    // =========================

    /**
     * Calcula la suma de los dos numeros.
     * 
     * @return Resultado de la suma
     */
    public double sumar() {
        return numero1 + numero2;
    }

    /**
     * Calcula la resta de los dos numeros.
     * 
     * @return Resultado de la resta
     */
    public double restar() {
        return numero1 - numero2;
    }

    /**
     * Calcula la multiplicacion de los dos numeros.
     * 
     * @return Resultado de la multiplicacion
     */
    public double multiplicar() {
        return numero1 * numero2;
    }

    /**
     * Calcula la division validando que el divisor no sea cero.
     * 
     * @return Resultado de la division
     */
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return numero1 / numero2;
    }

    // =========================
    // METODO PRINCIPAL
    // =========================

    /**
     * Metodo main que ejecuta el menu interactivo.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculatorJAVA calc = new CalculatorJAVA();
        int opcion = -1;

        // Ciclo que mantiene el menu activo hasta que el usuario elija salir
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

            // Validacion para evitar errores si el usuario escribe letras
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada invalida.");
                continue;
            }

            switch (opcion) {

                case 1:
                    try {
                        System.out.print("Ingrese el primer numero: ");
                        double n1 = Double.parseDouble(sc.nextLine());

                        System.out.print("Ingrese el segundo numero: ");
                        double n2 = Double.parseDouble(sc.nextLine());

                        calc.ingresarNumeros(n1, n2);
                        System.out.println("Numeros guardados correctamente.");
                    } catch (Exception e) {
                        System.out.println("Entrada invalida.");
                    }
                    break;

                case 2:
                    System.out.println("Resultado suma: " + calc.sumar());
                    break;

                case 3:
                    System.out.println("Resultado resta: " + calc.restar());
                    break;

                case 4:
                    System.out.println("Resultado multiplicacion: " + calc.multiplicar());
                    break;

                case 5:
                    System.out.println("Resultado division: " + calc.dividir());
                    break;

                case 0:
                    System.out.println("Gracias por usar la calculadora.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);

        sc.close(); // Cierre del Scanner
    }
