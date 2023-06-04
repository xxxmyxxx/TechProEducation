package day17arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn java earn money.";

        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        //Ornek 2; Size verilen cumlede kac harf oldugunu gosteren kodu yaziniz
        String latters[]=s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(latters));
        System.out.println(latters.length);
    }
}
