package day15loops;

public class NestedLoopTekrar {
    public static void main(String[] args) {
         /*
        Example 1: Asagidaki sekli cizen kodu yaziniz
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5               */

        for (int i = 1; i <6; i++) {      //row
            for (int j = 0; j <i; j++) {//column
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
