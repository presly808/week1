/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional15 {
    public static int squareAndCircle(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter S of square");
        double squareS = sc.nextDouble();

        System.out.println("Enter Sof circle");
        double circleS = sc.nextDouble();

        double squareSide = Math.sqrt(squareS);
        double circleRadius = Math.sqrt(circleS) / 3.14;

        if(2 * circleRadius <= squareSide){
            System.out.println("You can put circle in square");
            return 0;
        }

        if(2 * circleRadius >= Math.sqrt(2) * squareSide){
            System.out.println("You can put square in circle");
            return 1;
        }

        System.out.println("You can't put square in circle or circle in square");
        return -1;
    }
}
