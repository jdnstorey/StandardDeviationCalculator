package me.scottstorey;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> values = new ArrayList<>();
    ArrayList<Double> brackets = new ArrayList<>();
    ArrayList<Double> bracketSquared = new ArrayList<>();

    double userData;
    double sum = 0;
    double mean;
    double sumOfDiff = 0;
    double userDataMin1;
    double diffSumMinus1;

    public void method() {
        System.out.println();
        System.out.println("How many pieces of data are there");
        userData = scanner.nextDouble();
        System.out.println();

        for(int a = 0; a < userData; a++){
            System.out.println("Please write a piece of data");
            values.add(scanner.nextDouble());
            System.out.println();
        }
        scanner.close();

        for(int b = 0; b < userData; b++){
            sum += values.get(b);
        }
        //System.out.println("Sum: " + sum);

        mean = sum / userData;
        //System.out.println("Mean: " + mean);

        for(int c = 0; c < userData; c++){
            brackets.add(values.get(c) - mean);
        }
        //System.out.println(brackets);

        for(int d = 0; d < userData; d++){
            bracketSquared.add(brackets.get(d) * brackets.get(d));
        }
        //System.out.println(bracketSquared);

        for(int e = 0; e < userData; e++){
            sumOfDiff += bracketSquared.get(e);
        }
        //System.out.println("FinalSumofDiff: " + sumOfDiff);

        userDataMin1 = userData - 1;
        diffSumMinus1 = sumOfDiff / userDataMin1;
        //System.out.println("diffSumMinus1: " + diffSumMinus1);

        System.out.println("Standard Deviation: " + Math.sqrt(diffSumMinus1));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.exit(0);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.method();
    }
}
