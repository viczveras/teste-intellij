package br.com.dio.Model.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("Resultado soma: " + somar);
        System.out.println("Resultado subtração: " + subtrair);
        System.out.println("Resultado multiplicacao: " + multiplicar);
        System.out.println("Resultado divisão: " + dividir);


        public static int somar ( int a, int b){
            return a + b;

        }
    public static int subtrair ( int a, int b){
            return a - b;

        }
    }public static int multiplicar ( int a, int b){
            return a * b;
        }
    }public static int dividir(int a, int b) {
        return a / b;

    }



}

    }
