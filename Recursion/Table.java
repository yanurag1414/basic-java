package Recursion;

public class Table {
    public static void main(String[] args) {
        table(5,10);

    }
    static void table(int num,int upto){
        if(upto==0){
            return;
        }
        table(num,upto-1);
        System.out.println(num+" * "+" "+upto+" = "+num*upto);
    }
}

