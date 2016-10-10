/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional3 {
    public static void task(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int [] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = num % 10;

            num -= arr[i];
            num /= 10;
        }

        if((arr[0] == arr[1]) && (arr[1] == arr[2])) {
            System.out.println("All numbs are equals");
            return;
        }

        if((arr[0] == arr[1]) || (arr[1] == arr[2]) || (arr[2] == arr[0])) {
            System.out.println("Two numbs are equals");
            return;
        }

        System.out.println("All numbs are different");
    }
}
