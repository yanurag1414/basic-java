import java.util.*;

public class hello {
    static public void main(String[] args) {
        int n=10;
        for (int i = 0; i < n ; i++) {
            System.out.print(fib(i)+" ");
        }


        }
        static int fib(int n){
            if(n<=1){
                return n;
            }
            return fib(n-1)+fib(n-2);
        }

}
