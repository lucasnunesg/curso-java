package entities;
import java.util.Scanner;

public class Vector {
    public void firstExercise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int quantity = sc.nextInt();
        int[] vect = new int[quantity];

        for (int i=0; i<quantity; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for (int j : vect) {
            if (j < 0) {
                System.out.println(j);
            }
        }
        sc.close();
    }
    public void secondExercise(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }

        double sum = 0.0;

        System.out.print("VALORES = ");

        for (double v : vet) {
            System.out.printf(v + "   ");
            sum += v;
        }

        double avg = sum / vet.length;

        System.out.printf("%nSOMA = %.2f%n", sum);
        System.out.printf("MÉDIA = %.2f%n", avg);

        sc.close();
    }

    public void thirdExercise() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        People[] people = new People[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:%n",i+1);
            System.out.print("Nome: ");
            String name = sc.next();
            sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            people[i] = new People(name, age, height);
        }

        double heightSum = 0.0;

        for (People value : people) {
            heightSum += value.getHeight();
        }

        double heightAvg = heightSum / people.length;
        System.out.printf("Altura média: %.2f\n", heightAvg);

        int lessThanSixteen = 0;

        for (People person : people) {
            int currentAge = person.getAge();
            if (currentAge < 16) {
                lessThanSixteen += 1;
            }
        }

        double percentage = 100.0 * lessThanSixteen / people.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);

        for (People person : people) {
            int currentAge = person.getAge();
            if (currentAge < 16) {
                String less = person.getName();
                System.out.println(less);
            }
        }
        sc.close();
    }

}
