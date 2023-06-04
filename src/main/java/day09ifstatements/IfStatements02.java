package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu konsola yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");

        int num=input.nextInt();

        // note : % (macilis)

        if(num%2==0){
            System.out.println(num+" cift sayidir");
        }
        if(num%2!=0){
            System.out.println(num+" tek sayidir");
        }

        //2. Yol ==> kontrol edilen condition sayisi az oldugundan dolayi tavsiye edilir
        if(num%2==0){
            System.out.println("Cift sayi");
        }else{//aksi halde
            System.out.println("Tek sayidir");
        }


    }
}