package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        // ornek : Bir Stringi ters ceviren programi yaziniz
        // java -> avaj

        // 1.Yol
        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1; i > -1; i--) {
            ters = ters + t.substring(i, i + 1);
        }
        System.out.println(ters);


        // 2.Yol

        String u = "Java";
        String ters2 = "";

        for (int i = u.length() - 1; i > -1; i--) {
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);
        System.out.println("-----");

        // Ornek 2: size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz

        String s = "kavak";
        String ters3 = "";

        for (int i= s.length()-1; i>-1 ; i--){
            ters3=ters3+s.charAt(i);
        }
        System.out.println(ters3);

        //String nedir =s.equalsIgnoreCase(ters3)?"Palindrom":"Palindrom degil";
        //System.out.println(nedir);

        if(s.equalsIgnoreCase(ters3)){
            System.out.println("palindromedur");
        }else {
            System.out.println("degildir");
        }

    }
}
