import java.lang.reflect.Array;
import java.util.Arrays;

public class RunningSum {

    public int[] runSum(int[] num){
        for(int i=1; i<num.length;i++){
            num[i]=num[i-1]+num[i];
        }
        return num;
    }

    public static void main(String[] args) {
        RunningSum rs= new RunningSum();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};;

        int[] result =rs.runSum(input);
        System.out.println(Arrays.toString(result));

    }
}
