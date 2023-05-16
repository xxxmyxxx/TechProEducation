package day10ifstatements01;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        // Example : Verilen bir sayinin pozitif negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("+ dir.");
        } else if (num < 0) {
            System.out.println("- dir");
        }else {
            System.out.println("notrdur");
        }

    }
}