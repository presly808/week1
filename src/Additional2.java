/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional2 {
    public static void task(){

        double[] arr = Main.input(3);

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] > 0 ? Math.pow(arr[i], 3) : 0;
        }

        // rename class Main, eg. ArrayUtils
        Main.outputArr(arr);
    }
}
