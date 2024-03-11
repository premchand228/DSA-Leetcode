public class Factorial {
    public  double calfact(int n){
        double result;
        if(n==0 || n==1){
            return 1;
        }
        return (n*calfact(n-1));
    }
    public  static  void  main (String[] args){
        Factorial f = new Factorial();
        System.out.println(f.calfact(5));

    }

}
