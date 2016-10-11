/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional8 {
    public static double cost(){

        double price = input();

        return output(price);
    }

    public static double input(){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();

        while(price < 0){
            System.out.println("Incorrect input");
            price = sc.nextDouble();
        }

        return price;
    }

    public static double output(double price){

        if(price > 1000){
            price *= 0.9;
        }

        System.out.println("Cost " + price);
        return price;
    }
}
