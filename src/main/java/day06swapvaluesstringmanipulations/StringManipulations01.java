package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        // 1 String bir non-primitive data typedir.aynı zamanda bir classdır

        String s = "Java is easy";   //Ornek1: "s" Stringdeki tüm characterleri büyük harf yapın

        String sUpper = s.toUpperCase();

        System.out.println("sUpper = " + sUpper);

        // 2 küçük harf yap

        String sLower = s.toLowerCase();

        System.out.println("sLower = " + sLower);

        // 3: "s" Stringindeki ilk charecteri alınız.

        char firsChar = s.charAt(0);
        System.out.println(firsChar); // J

        // 4 : "s" Stringindeki baştan 2. ve sondan 2. karakteri alınız.
        char second = s.charAt(1);
        char lastSecond = s.charAt(s.length() - 2);

        System.out.println("second = " + second);
        System.out.println("lastSecond = " + lastSecond);

        System.out.println(second + lastSecond); // 212 verdi çünkü çarları matematiksel işlemlerde kullanırsak sayı gibi davranır
        // harf değerlerini vermesini istiyorsak şöyle yazmak lazım
        System.out.println("" + second + lastSecond); // buna concatination deniyor( String ise sonrasında iflah olmuyor sayı bile olsa
        // string gibi davranıyor

        // Example 5: "s" stringinde kullanılan character sayisini bulunuz.

        int sLenght = s.length();  //"java is easy"
        System.out.println("sLenght = " + sLenght);

        // Example 5: "s" Stringindeki ilk 4 karakteri alınız.
        // s.substring [0,4) --> ilk kullanım dahil son kullanım dahil değil.ilk 4 ü istiyorsan sona 4 ü yazacaksın.

        String sub1 = s.substring(0, 4);
        System.out.println("sub1 = " + sub1);

        //is yaz

        String sub2 = s.substring(5, 7); // is
        System.out.println("sub2 = " + sub2);

        //easy yaz

        String sub3 = s.substring(8, 12); //easy
        System.out.println("sub3 = " + sub3);

        String sub4 = s.substring(8);
        System.out.println("sub4 = " + sub4);

        // örnek 9 : "s" Stringinde "money kelimesi var mı kontrol et
        boolean isExist = s.contains("money");
        System.out.println("isExist = " + isExist);

        boolean varMı = s.contains("java");
        System.out.println("varMı = " + varMı);

        //örnek 10 : s Stringinin belli bir harfle başlayıp başlamadığını kontrol et

        boolean isStart = s.startsWith("Java");
        System.out.println("isStart = " + isStart);

        // örnek 11 : "s" Stringinin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile başlayıp başlamadığını
        // kontrol eden kodu yaziniz. yani 5 . indexten sonra "i" var mı hele bi bak bakalım

        boolean isBegin = s.startsWith("i",5);
        System.out.println("isBegin = " + isBegin);




    }
}
