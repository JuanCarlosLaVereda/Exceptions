package es.ieslavereda.Exercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        boolean fin = false;


        while (!fin){
            try {
                fin = addNums(vector);
            } catch (InputMismatchException e){
                System.err.println("Dato introducido invalido --> " + e + " vuelve a intentarlo.");
            }
        }

        System.out.println(Arrays.toString(vector));

    }

    public static boolean addNums(double[] vector) throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<vector.length; i++){
            System.out.print("Dame el valor de la posicion " + i + ": ");
            vector[i] = sc.nextDouble();
            System.out.println();
        }
        return true;
    }
}
