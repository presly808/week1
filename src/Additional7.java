/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional7 {
    public static String seasons(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month (1 - 12)");
        int month = sc.nextInt();

        String season;

        switch (month){
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                System.out.println("Incorrect input");
                return "";
        }

        System.out.println(season);
        return season;
    }
}
