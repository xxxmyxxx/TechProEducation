package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 1. Adim Scanner Classtan object oluştur
        Scanner input = new Scanner(System.in);

        // 2. Adim kullanıcıya ne istediğinize dair mesaj veriniz
        System.out.println("Lütfen yasinizi giriniz: ");

        //3. adim uygun metodu kullan kullanıcının verdiği datayı memoriye yerleştir.

        byte age = input.nextByte();
        System.out.println("age = " + age);


    }

}
