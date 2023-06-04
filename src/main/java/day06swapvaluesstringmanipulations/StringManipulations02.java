package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";
        // Ornek 1: "s" Strinde money ile biten var mı ?

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);

        //Ornek 2: "s" Stringindeki "money" kelimesini " dolar kelimesine çeviriniz.
        String s1 = s.replace("money", "dolar");
        System.out.println("s1 = " + s1);

        //Ornek 3: s string deki "earn" keliemsini "win" ile değiştiriniz.

        String s2 = s.replace("earn", "win");
        System.out.println("s2 = " + s2);

        String s3 = s.replace('a', '*'); // a yerine x koy
        System.out.println("s3 = " + s3);

        String s4 = s.replace("n", "xxx"); // n yerin xxx koy
        System.out.println("s4 = " + s4);

        String s5 = s.replace("e", "");  // e yi sil
        System.out.println("s5 = " + s5);

        String t = "Ali 13 yaşındadır!..."; // burdaki tüm rakamları "*" çevir.
        /*
        Note : Bir grup datayı değiştirmek için "Regular Expressions" yani Regex kullaniriz.
        Note : Bir grup datayı değiştirmek için replaceAll() metodu kulllanılır.
                 Meshur Regex
           1) Tum rakamlar            --> [0-9]
           2) Tum k.harfler           --> [a-z]
           3) Tum b.harfler           --> [A-Z]
           4) Tum k. ve b. harfler    --> [a-zA-Z]
           5) Tüm harfler ve rakamlar --> [a-zA-Z0-9]
           6) Tüm noktalama işaretleri--> \\p{Punct}
           7) Tüm sesli harfler --> [aeiouAEIOU]
           8) Tüm küçük harflerden fakrlı tüm karakterler -->[^a-z]
           9) Harfler haricindekiler --> [^a-zA-z]


         */
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println("t1 = " + t1);
    }
}
