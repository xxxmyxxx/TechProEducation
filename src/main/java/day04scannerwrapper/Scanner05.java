package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz. 38671

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
        int number = input.nextInt();

        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz
        // % => modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        // dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir
        //bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar
        //java  bu durumda yuvarlama yapmaz, ondalik kismi iptal eder
        //dolayisiyle bir tamsayiyi 10 a bolersek birler basamagini silmis oluruz

        int birler    = number % 10;
        System.out.println("birler   = " + birler);
        number = number / 10;

        int onlar     = number % 10;
        System.out.println("onlar    = " + onlar);
        number = number / 10;

        int yuzler    = number % 10;
        System.out.println("yuzler   = " + yuzler);
        number = number / 10;

        int binler    = number % 10;
        System.out.println("binler   = " + binler);
        number = number / 10;

        int onbinler = number % 10;
        System.out.println("onbinler = " + onbinler);
        number = number / 10;


        System.out.println(birler+onlar+binler+onbinler);




    }
}