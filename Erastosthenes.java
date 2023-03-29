import java.lang.reflect.Array;
import java.util.Vector;

public class Erastosthenes {
    public static void main(String[] args) {
        erastothenes(20);

    }

    static void erastothenes(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }


        for (int i = 2; i <= n; i++) {
            if (Check_For_Prime.isPrime(i)) {               //using isPrime function from another class.
                System.out.println(i);
                for (int j = i * i; j <= n; j = j + i) {
                    prime[j] = false;
                }
            }
        }

    }
}

