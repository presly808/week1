/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();
*/
/*

        // Task with factorial

        int factorial = Factorial.fact(num);

        if(factorial == -1){
            System.out.println("Error, negative input");
            return;
        }

        System.out.println(factorial);
*/
/*
        // Task with amount of numbers

        System.out.println("Enter what you want to find");

        int check = sc.nextInt();

        System.out.println(HowManyNumbs.amountOfNumbers(num, check));
*/
//      Additional1.triangle();
//      Additional2.task();
//      Additional3.task();
//      Additional4.compareSpeeds();
//      Additional5.sameNumbers();
//      Additional6.timeOfTravel();
//      Additional7.seasons();
//      Additional8.cost();
//      Additional9.goodWeigth();
//      Additional10.cost();
//      Additional11.money();
//      Additional12.stormMark();
//      Additional13.task();
//      Additional15.squareAndCircle();
//      Additional14.luckyNumber();
    }

    public static void outputArr(double[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "   ");
        }

        System.out.println();
    }

    public static double[] input(int num){

        Scanner sc = new Scanner(System.in);

        double [] arr = new double[num];

        System.out.println("Enter " + num + " numbers");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
        }

        return arr;
    }
}
