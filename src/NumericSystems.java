/**
 * Created by zhenia on 10.10.16.
 */
public class NumericSystems {

        public static int decToBinary(int dec){
            int binary = 0;
            int i = 0;

            do{
                int tmp = dec % 2;

                binary = (int)(tmp * Math.pow(10, i)) + binary;
                dec /= 2;

                i++;
            } while (dec > 1);

            if(dec == 1) binary = (int)(dec * Math.pow(10, i)) + binary;

            return binary;
        }

        public static int binaryToDec(int binary){
            int dec = 0;
            int i = 0;
            while(binary != 0){
                int tmp = binary % 10;

                dec += tmp * Math.pow(2, i);

                binary -= tmp;
                binary /= 10;
                i++;
            }

            return dec;
        }

}
