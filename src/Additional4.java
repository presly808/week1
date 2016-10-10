/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional4 {
    public static int compareSpeeds(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first speed in km/h");
        double speed1 = sc.nextDouble();

        System.out.println("Enter second speed in m/s");
        double speed2 = sc.nextDouble();

        speed1 /= 3.6;

        if(speed1 > speed2){
            System.out.println("First object is faster");
            return 1;
        }
        if(speed1 < speed2){
            System.out.println("Second object is faster");
            return -1;
        }

        System.out.println("Speeds are equals");
        return 0;
    }
}
