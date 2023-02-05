package Searching;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums={1,2,4,7,8,6};
        System.out.println(lsearch(nums,4));

    }
    static int lsearch(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
