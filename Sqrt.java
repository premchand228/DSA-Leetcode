public class Sqrt {

    public static  void  main(String[] args ){
        int n =8;
        Sqrt s =new Sqrt();
        double result=s.findsquare(n);
        System.out.println(result);
    }

    private double findsquare(int n) {

        int  l = 0; // Using double instead of int
        int  r = (int) (n / 2.0 + 1); // Using double instead of int
        double mid = 0;

        while (l <=r) { // Changed loop condition to handle non-integer square roots
            mid = (l + r) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                r = (int) mid; // No need to subtract 1 here
            } else {
                l = (int) mid; // No need to add 1 here
            }
            System.out.println("mid," + mid + " l," + l + " r," + r);
        }
        return mid;
    }

}
