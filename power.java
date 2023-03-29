public class power {
    public static void main(String[] args) {
        System.out.println(pow(4,2));

    }
    static int pow(int x,int n){             //time complexity O(logn)
        if(n==0){
            return 1;
        }
        int temp  = pow(x,n/2);
        temp = temp*temp;
        if (n%2 == 0) {
            return temp;
        }else {
            return temp*x;
        }
    }
}
