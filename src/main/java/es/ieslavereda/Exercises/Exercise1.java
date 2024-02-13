package es.ieslavereda.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
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
    }
}
