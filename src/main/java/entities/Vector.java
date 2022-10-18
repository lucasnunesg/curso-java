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

        for (int i=0; i<vect.length; i++){
            if (vect[i]<0) {
                System.out.println(vect[i]);
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

        for (int i=0; i<vet.length; i++) {
            System.out.printf(vet[i] + "   ");
            sum += vet[i];
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

        for (int i=0; i<people.length; i++) {
            heightSum += people[i].getHeight();
        }

        double heightAvg = heightSum / people.length;
        System.out.printf("Altura média: %.2f\n", heightAvg);

        int lessThanSixteen = 0;

        for (int i=0; i<people.length; i++) {
            int currentAge = people[i].getAge();
            if (currentAge < 16) {
                lessThanSixteen += 1;
            }
        }

        double percentage = (double) 100* lessThanSixteen / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);

        for (int j=0; j<people.length; j++) {
            int currentAge = people[j].getAge();
            if (currentAge < 16) {
                String less = people[j].getName();
                System.out.println(less);
            }
        }
        sc.close();
    }

}
