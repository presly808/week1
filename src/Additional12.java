/**
 * Created by zhenia on 11.10.16.
 */

import java.util.Scanner;

public class Additional12 {
    public static int stormMark(){
        Scanner sc = new Scanner(System.in);

        double speed;
        do {
            System.out.println("Enter wing speed");
            speed = sc.nextDouble();
        }while(speed <= 0);

        if(speed < 5){
            System.out.println("Слабый");
            return 1;
        }
        if(speed < 10){
            System.out.println("Умеренный");
            return 2;
        }
        if(speed < 19){
            System.out.println("Сильный");
            return 3;
        }
        System.out.println("Ураганный");
        return 4;
    }
}
