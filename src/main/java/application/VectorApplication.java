package application;

import entities.Vector;

import java.util.Locale;
import java.util.Scanner;

public class VectorApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("## Vectors Exercise List ##");
        System.out.println("1 - Negative Numbers Exercise");
        System.out.println("2 - Sum and Average Exercise");
        System.out.println("3 - Age exercise");
        System.out.print("Please select number of desired exercise: ");
        int exerciseNumber = sc.nextInt();

        switch (exerciseNumber) {
            case 1 -> Vector.firstExercise();
            case 2 -> Vector.secondExercise();
            case 3 -> Vector.thirdExercise();
        }

    }

}
