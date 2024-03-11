public class Palindrome {
    public  static  void main(String[] args){
        String s="madam";
        //System.out.println();
        for(int i=0;i<s.length();i++){
            char c = s.toCharArray()[s.length() - i-1];
            //System.out.println(s.toCharArray()[i]+","+ c);
           if(s.toCharArray()[i]== c){

           }
           else{
               System.out.println("Not a palindrome");
           }
        }
        System.out.println("Palindrome");
    }
}
