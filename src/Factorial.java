/**
 * Created by zhenia on 10.10.16.
 */
public class Factorial {
    public static int fact(int num){
        if(num < 0) return -1;
        if(num == 0 || num == 1) return 1;
        return num * fact(num - 1);
    }
}
