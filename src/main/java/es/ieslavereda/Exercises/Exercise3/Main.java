package es.ieslavereda.Exercises.Exercise3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Gato gatoEj = new Gato(33, "SIHOMBRE");
            Gato gatoEj2 = new Gato(-33, "la que te cuento");
        } catch (ExceptionGatuna e){
            System.err.println(e);
        }

        Scanner sc = new Scanner(System.in);
        List<Gato> camada = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Nombre del gato " + i + ": ");
                String nombre = sc.next();
                System.out.print("\nEdad del gato" + i + ": ");
                int edad = sc.nextInt();
                camada.add(new Gato(edad, nombre));
            } catch (InputMismatchException e){
                System.err.println("Dato introducido no valido ---> " + e);
                sc.nextLine();
                i--;
            } catch (ExceptionGatuna e){
                System.err.println("Algun dato del valido no es valido (Nombre del gato minimo 3 caracteres y edad no puede ser negativa) ---> " + e);
                sc.nextLine();
                i--;
            }

        }

        System.out.println(camada);

    }
}
