/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional2 {
    public static void task(){
        Scanner sc = new Scanner(System.in);

        double [] arr = new double[3];

        System.out.println("Enter 3 numbers");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] > 0 ? Math.pow(arr[i], 3) : 0;
        }

        Main.outputArr(arr);
    }
}
