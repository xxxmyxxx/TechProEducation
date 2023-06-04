package day14loops;

public class ucgen {
    public static void main(String[] args){
    /*

    x
    x x
    x x x
    x x x x
    x x x x x

      */
        for (int i = 1; i <=5 ; i++) {   // row
            for (int j = 5;  j>5-i ; j--) { // column
                System.out.print("x ");
            }
            System.out.println();

        }
    }
}
