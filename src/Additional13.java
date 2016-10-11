/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional13 {
    public static double[] task(){
        double[] arr = Main.input(3);

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
        return arr;
    }
}
