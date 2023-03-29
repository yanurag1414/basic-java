public class Erastosthenes {
    public static void main(String[] args) {

    }
    static void erastothenes(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int i) {
        if(i<=1){
            return false;
        }
        return true;
    }
}
