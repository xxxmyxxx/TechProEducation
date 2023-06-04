package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        //Ornek : Iki boyutlu bir arrayi tek boyutlubir arraya ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2}}; // ==> {5,4,2,3,2}

        int sum = 0;
        for (int[] w:numbers) {
            sum=sum+ w.length;
        }
        System.out.println(sum);

        int idx=0;
        int arr [] = new int[sum];
        for (int [] w : numbers ) {
            for (int k: w) {
                arr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
