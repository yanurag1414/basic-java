package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Bsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    //In every transversal the largest element in
    //array will be sorted
    //In every transversal we decrease the array size by one
    //Because one element is sorted in every transversal
    static void Bsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
