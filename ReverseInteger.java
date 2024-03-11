import java.math.BigInteger;
import java.util.Arrays;

public class ReverseInteger
{

    public static void main(String[] args) {


        ReverseInteger p= new ReverseInteger();
        long result=p.reverse(-123);
        System.out.println(result);
    }

    private int reverse(int x) {

        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if(reversed>Integer.MAX_VALUE){
                return 0;
            }
            if(reversed<Integer.MIN_VALUE){
                return 0;
            }
            reversed = reversed * 10 + digit;

            x /= 10;
        }
        return reversed;


    }
}
