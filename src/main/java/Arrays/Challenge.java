
package Arrays;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.print("How many evaluations: ");
        int nbEvaluation = inputValue.nextInt();

        double[] evaluations = new double[nbEvaluation];

        for (int i = 0; i < evaluations.length; i++) {
            System.out.print("Insert a evaluation " + (i + 1) + ": ");
            evaluations[i] = inputValue.nextDouble();
        }

        double total = 0;
        for(double evaluation: evaluations) {
            total += evaluation;
        }

        double average = total / evaluations.length;
        System.out.println("The average is " + average + "!");
        inputValue.close();
    }
}