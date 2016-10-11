/**
 * Created by zhenia on 11.10.16.
 */

import java.util.Scanner;

public class Additional10 {
    public static double cost(){
        Scanner sc = new Scanner(System.in);

        int day;
        do {
            System.out.println("Enter day of week");
            day = sc.nextInt();
        }while((day < 1) || (day > 7));

        double price;
        do {
            System.out.println("Enter price per min");
            price = sc.nextDouble();
        }while(price < 0);

        double time;
        do {
            System.out.println("Enter time in min");
            time = sc.nextDouble();
        }while(time < 0);

        if(day > 5){
            price *= time * 0.8;
        }
        else {
            price *= time;
        }

        System.out.println("Cost is " + price);
        return price;
    }
}
