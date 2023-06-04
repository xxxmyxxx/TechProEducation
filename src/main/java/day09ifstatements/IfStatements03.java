package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //Ornek : Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazdiran
        // kucuk harf ise "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.print("Bir char giriniz: ");

        char ch = input.next().charAt(0);

        if (ch >= 'A' && ch <'Z' ){
            System.out.println("Buyuk harftir");
        }else if(ch >= 'a' && ch <'z' ){
            System.out.println("Kucuk harftir");
        }else {
            System.out.println("harf degil");
        }



    }
}