import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

    public static void main(String[] args ){
        AddToArrayForm Af=new AddToArrayForm();
        List<Integer> l =Af.addToArray(new int[]{1,2,0,0},34);
        System.out.println(l);

        
    }

    private List<Integer> addToArray(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int carry =k;
        for(int i=num.length-1;i>=0||carry>0;i--){
            if(i>=0){
                carry+=num[i];

            }
            result.add(carry%10);
            carry/=10;
        }
        //Collections.reverse(result);

        return  result.reversed();

    }

}
