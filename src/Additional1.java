/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional1 {
    public static int triangle(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sizes");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if((a + b <= c) || (a + c <= b) || (b + c <= a)){
            System.out.println("Not a triangle");
            return -1;
        }

        a *= a;
        b *= b;
        c *= c;

        if((a + b == c) || (a + c == b) || (b + c == a)){
            System.out.println("One of the angles is 90");
            return 1;
        }

        System.out.println("Regular triangle");
        return 0;
    }
}
