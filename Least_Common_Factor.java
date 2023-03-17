public class Least_Common_Factor {
    public static void main(String[] args) {
        System.out.println(lcm(4,6));

    }
    static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    static int lcm(int a , int b){         //a*b=gcd(a,b)*lcm(a,b)
        return (a*b)/gcd(a,b);
    }
}
