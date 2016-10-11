/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional1 {
    public static int triangle(){

        double[] arr = Main.input(3);

        for(int i = 0; i < 3; i++){
            if(arr[i] <= 0){
                System.out.println("Incorrect input, repeat pls");
                arr = Main.input(3);
                i = -1;
            }
        }

        return isRegular(check(arr), arr);
    }

    public static boolean check(double[] arr){
        if((arr[0] + arr[1] <= arr[2]) || (arr[0] + arr[2] <= arr[1]) || (arr[1] + arr[2] <= arr[0])){
            System.out.println("Not a triangle");
            return false;
        }
        return true;
    }

    public static int isRegular(boolean check, double[] arr){

        if(check) {

            for(int i = 0; i < 3; i++){
                arr[i] *= arr[i];
            }

            if ((arr[0] + arr[1] == arr[2]) || (arr[0] + arr[2] == arr[1]) || (arr[1] + arr[2] == arr[0])) {
                System.out.println("One of the angles is 90");
                return 1;
            }

            System.out.println("Regular triangle");
            return 0;
        }
        else return -1;
    }
}
