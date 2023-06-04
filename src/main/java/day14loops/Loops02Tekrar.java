package day14loops;

public class Loops02Tekrar {
    public static void main(String[] args) {
        //Ornek 1: 5 den 8 e kadar tamsayilarin toplamini veren kodu yaziniz
        //Ornek 2: 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        //Ornek 3: Verilen bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        // 578  ==> 5 + 7 + 8 = 20

        //1.

        int temp = 0;
        for (int i = 5; i < 9; i++) {
            temp += i;

        }
        System.out.println(temp);

        //2.
        int temp2 = 1;
        for (int i = 7; i < 10; i++) {
            temp2 *= i;
        }
        System.out.println(temp2);

        //3.


        int toplam =0;
        int n=-578;
        n=Math.abs(n);


        for (int i =n ; i >0 ; i=i/10) {
            toplam = toplam+i % 10 ; // 8

        }
        System.out.println(toplam);
    }
}
