package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek 1;
        int a = 10;
        int b = 20;

        int r1 = b < a ? a++ : ++b;

        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20

        //Ornek 2 Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //      -4 ==> -1*-4            4==>4   0==>0
        int c = 4;
        int r2 = c < 0 ? -1 * c : c;
        System.out.println(r2);

        //Ornek 3: iki sayinin isareti ayni ise bu sayilari carpan isaretleri farkli ise
        //"farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz
        int m = 5;
        int n = -6;

        Object r3 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

        //Ornek 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int p = -313;

        p = Math.abs(p);

        String r4 = p>99 && p <1000 ? "uc basamaklidir":"uc basamakli degildir";

        System.out.println(r4);


    }
}