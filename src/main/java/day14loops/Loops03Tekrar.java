package day14loops;

import java.util.Scanner;

public class Loops03Tekrar {
    public static void main(String[] args) {
        // Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        // Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Baslangic gir :");
        int start = scan.nextInt();
        System.out.print("Son gir :");
        int son = scan.nextInt();

        if(start>son){
            System.out.println("Baslangic sayisi bitis sayisindan buyuk olmalidir");

        }else {
            for (int i = start; i <= son; i++) {
                if(i%2==0){
                    System.out.print(" "+i);
                }

            }
        }
        //Ornek 2: Hic sayi kullanmadan 1 den 100 e kadar olan sayilari console a yazdiriniz

        for (int i = 'd'/'d'; i <='d' ; i++) {
            System.out.print(" "+i);

        }

    }
}
