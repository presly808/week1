/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional14 {
    public static boolean luckyNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number > 99999, < 1000000");
        int num = sc.nextInt();

        if((num < 100000) || (num > 999999)){
            System.out.println("Incorrect input");
            return false;
        }

        int tmp = num % 1000;

        num -= tmp;
        num /= 1000;

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < 3; i++){
            sum1 += tmp % 10;
            tmp -= tmp % 10;
            tmp /= 10;

            sum2 += num % 10;
            num -= num % 10;
            num /= 10;
        }

        if(sum1 == sum2){
            System.out.println("Number is lucky");
            return true;
        }
        else {
            System.out.println("Number isn't lucky :(");
            return false;
        }
    }
}
