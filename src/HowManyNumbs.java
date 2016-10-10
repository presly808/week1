/**
 * Created by zhenia on 10.10.16.
 */
public class HowManyNumbs {
    public static int amountOfNumbers(int num, int check){

        int amount = 0;

        do{
            int tmp = num % 10;

            if(tmp == check) amount++;

            num -= tmp;
            num /= 10;

        } while(num > 0);

        return amount;
    }
}
