package day0Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 2./*
        //     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
        //     * return eden metod yaziniz
        //     *
        //     * ornek:  input            output
        //     *         elma  2           eaea
        //     *         army  3           ayayay
        //     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string gir bro bak napacam :");
        String kelime = scan.next();
        System.out.print("Bir de Rakam gir bro :");
        byte rakam=scan.nextByte();

        girilenSayiKadarIlkVeSonHarfiTekrarEtme(kelime,rakam);

    }

    public static void girilenSayiKadarIlkVeSonHarfiTekrarEtme(String kelime, byte rakam) {
        char ilk = kelime.charAt(0);
        char son = kelime.charAt(kelime.length()-1);
        String ilkSon=""+ilk+son;
        System.out.println(ilkSon.repeat(rakam));
    }


}
