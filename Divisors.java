public class Divisors {
    public static void main(String[] args) {
//        divisors(25);
        divisors_sorted(25);

    }
    static void divisors(int n){
        if (n<1){
            System.out.println("Please enter a valid number");
        }
        for (int i = 1; i*i <= n; i++) {
            if(n%i == 0){
                System.out.println(i);
                if(i != n/i) {
                    System.out.println(n / i);
                }
            }
        }
    }






    //to print in a sorted order
    static void divisors_sorted(int n){
        int i;
        for (i = 1; i*i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
            for (int j = i; j >= 1; j--) {                      // starts with i==6
                if (n % j == 0) {
                    System.out.println(n / j);
                }
            }
    }
}
