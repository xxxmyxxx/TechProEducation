package day15loops;

import java.util.Scanner;

public class DoWhileLoop02Tekrar {
    public static void main(String[] args) {
        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Lutfen bir sayi giriniz: ");
            int n =input.nextInt();
            if (n<=100){
                System.out.println("Are you looser ?" );

            }else {
                System.out.println("You are win");
                break;
            }
        }while (true);


    }
}
