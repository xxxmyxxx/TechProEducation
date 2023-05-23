package day14Loops01;

public class Loops02 {
    public static void main(String[] args) {
        // ornek 1 : 5 ten 8 e kadar olan tamsayilarin toplami nedir

        int sum = 0;
        for (int i = 5; i<9; i++){
            sum=sum+i;
            System.out.println(i-4+".Step = "+sum);
        }
        System.out.println("sum = " + sum);


        // ornek 2: 7 den 9 a kadar tam sayilarin carpimini veren kodu yaziniz

        int multiply =1;
        for(int i =7; i<10; i++){

            multiply*=i;
        }
        System.out.println("multiply = " + multiply);
        System.out.println("--------");

        // Ornek 3: Verilen bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        // 578 ==> 5 + 7 +8 =20

        int toplam = 0;
        int num = Math.abs(num);
                  // 8

                  // 5
                  // 57
                  // 578
        for (int i = 578; i >0 ; i= i/10) {
            toplam = toplam + i % 10;
            // 0   =   0    +  8
            // 8   =   8    +  7
            //15   =   15   +  5 = 20

        }
        }

    }

}
