package es.ieslavereda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div,x,y;

        try {
            System.out.print("Introduce el numerador: ");
            x = sc.nextInt();
            System.out.println();
            System.out.print("Introduce el denominador: ");
            y = sc.nextInt();
            System.out.println();
            div = x/y;
            System.out.print("Resultado: " + div);
            System.out.println();
        } catch (ArithmeticException e){
            System.err.println("Error producido: " + e);
        } catch (InputMismatchException e){
            System.err.println("Vaya con las letras..." + e);
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("FIN");
        }

        int[] vector = new int[]{1,2,3,4,5,6,7,8,9};
        int pos;

        try {
            System.out.print("Dame la posicion del vector: ");
            System.out.println();
            pos = sc.nextInt();
            System.out.println("Valor: " + vector[pos]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Posicion invalida: " + e);
        } catch (InputMismatchException e){
            System.err.println("Dato ofrecido invalido: " + e);
        } finally {
            System.out.println("FIN");
        }


    }
}
