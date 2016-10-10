/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional13 {
    public static void task(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        double[] arr = new double[3];

        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextDouble();
        }

        int tmp = 0;

        for(int i = 0; i < 3; i++){
           tmp += arr[i];
        }

        if(tmp > 0){
            for(int i = 0; i < 3; i++){
                arr[i] *= 2;
            }
        }
        else {
            for(int i = 0; i < 3; i++){
                arr[i] = 0;
            }
        }

        System.out.println("Result");
        Main.outputArr(arr);
    }
}
