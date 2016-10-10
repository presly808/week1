/**
 * Created by zhenia on 10.10.16.
 */

import java.util.Scanner;

public class Additional6 {
    public static double timeOfTravel(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter speed in m/s");
        double speed = sc.nextDouble();

        System.out.println("Enter distance in m");
        double distance = sc.nextDouble();

        double seconds = distance / speed;
        int mins = 0;
        int hours = 0;

        if(seconds > 60){
            mins = (int)seconds / 60;
            seconds -= mins * 60;

            if(mins > 60){
                hours = mins / 60;
                mins -= hours * 60;
            }
        }

        System.out.println("You will get to the point in " + hours + " h, " +
                                                mins + " min, " + seconds + " s");
        return distance/speed;
    }
}
