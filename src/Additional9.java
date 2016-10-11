/**
 * Created by zhenia on 11.10.16.
 */

import java.util.Scanner;

public class Additional9 {
    public static double goodWeigth(){
        Scanner sc = new Scanner(System.in);
        double height;
        double weight;

        do {
            System.out.println("Enter your height");
            height = sc.nextDouble();
        }while(height <= 100);

        do {
            System.out.println("Enter your weight");
            weight = sc.nextDouble();
        }while(weight <= 0);

        double ideal = height - 100;

        if(ideal == weight){
            System.out.println("Congratulations, your weight is ideal!");
            return 0;
        }

        if(ideal > weight){
            System.out.println("You need to take " + (ideal - weight) + " kg");
            return ideal - weight;
        }

        System.out.println("You need to loose " + (weight - ideal) + " kg");
        return weight - ideal;
    }
}
