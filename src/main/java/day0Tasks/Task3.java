package day0Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3.
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        // kac adet bosluk girildiginizi return eden metodu yazin

        System.out.println("String bir ifade giriniz : ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        SpaceSayisi(s);



    }

    public static void SpaceSayisi(String s) {
        String spaceler=s.replaceAll("[^ ]","");
        int spaceSayisi=spaceler.length();
        System.out.println(spaceSayisi);


    }
}
