public class pattern {
    public static void main(String[] args) {
        spatter(4);

    }
    static void spatter(int n){
        for (int i = 1; i <n+1 ; i++) {
            for (int j = n; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
