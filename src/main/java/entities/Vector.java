package entities;

import java.util.Scanner;

public class Vector {
    public void primeiroExercicio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int quantity = sc.nextInt();
        int[] vect = new int[quantity];

        for (int i=0; i<quantity; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<vect.length; i++){
            if (vect[i]<0) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
