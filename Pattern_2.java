import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pattern_2 {
    //ternary operator;
    public static void main(String[] args) {
        ptr(5);
        

    }
    static void ptr(int n){
        for (int i = 2*n-1; i >=1 ; i--) {
            System.out.print(n);
        }
        System.out.println();
        for (int i = 2*n-3; i >=1 ; i--) {
            for (int j = 1; j < 2 ; j++) {
                System.out.print(n);
                for (int k = 2*n-3; k >=1 ; k--) {
                    System.out.print(n-1);
                }
                System.out.println();
            }

        }
        for (int i = 2*n-1; i >=1 ; i--) {
            System.out.print(n);
        }
    }
}

