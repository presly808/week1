/**
 * Created by zhenia on 10.10.16.
 */

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class Additional11 {
    public static String money(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of cents");
        int cent = sc.nextInt();

        String[] numbNames = {  "копеек",
                                "копейка",
                                "копейки",
                                "копейки",
                                "копейки",
                                "копеек",
                                "копеек",
                                "копеек",
                                "копеек",
                                "копеек"    };

        String ResultStr = cent + " " + numbNames[cent % 10];

        System.out.println(ResultStr);
        return ResultStr;
    }
}
