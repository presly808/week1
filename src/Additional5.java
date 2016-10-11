/**
 * Created by zhenia on 11.10.16.
 */
public class Additional5 {
    public static boolean sameNumbers(){
        double[] arr = Main.input(3);

        if((arr[0] == arr[1]) || (arr[0] == arr[2]) || (arr[1] == arr[2])){
            System.out.println("There are least 2 same numbers");
            return true;
        }

        System.out.println("All three numbers are different");
        return false;
    }
}
