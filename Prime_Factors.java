public class Prime_Factors {
    public static void main(String[] args) {
        p_Factor(14);

    }
    static void p_Factor(int n) {
        if (n <= 1) {
            return;
        }
        while (n % 2 == 0) {
            System.out.println(2);
            n /= 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n /= 3;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
            while (n % (i + 2) == 0) {
                System.out.println(i + 2);
                n /= i + 2;
            }
        }
        if(n>3){
            System.out.println(n);
        }
    }
}
