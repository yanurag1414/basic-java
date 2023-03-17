public class Trailing_Zeroes_In_Factorial {
    public static void main(String[] args) {
        System.out.println(tzeroes(27));

    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    static int tzeroes(int n){
        fact(n);
        int zeroes = 0;
        for (int i = 5; i <= n; i=i*5) {
            zeroes = zeroes + n/i;
        }
        return zeroes;
    }
}
