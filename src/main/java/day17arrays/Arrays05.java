package day17arrays;

import java.util.Arrays;

public class Arrays05 {
    //Interview question
    // Example 1 : [0,2,3,0,12,0] sifirlari en sona koyunuz [2,3,12,0,0,0]
    public static void main(String[] args) {
        int a [] ={0,2,3,0,12,0};
        int b [] =new int[a.length];


        int idx = 0;

        for (int w:a) {
            if (w!=0){
                b[idx]=w;
                idx++;
            }

        }
        System.out.println(Arrays.toString(b));


    }
}
