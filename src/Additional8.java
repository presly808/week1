/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional8 {
    public static double cost(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price");
        double price = sc.nextDouble();

        if(price < 0){
            System.out.println("Incorrect input");
            return -1;
        }

        if(price > 1000){
            price *= 0.9;
        }

        System.out.println("Cost " + price);
        return price;
    }
}
