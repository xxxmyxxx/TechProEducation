package day14loops;

public class Loops01Tekrar {
    public static void main(String[] args) {
        // ornek : Bir Stringi ters ceviren programi yaziniz
        // java -> avaj

        String s = "java";
        String temp = "";

        for (int i = s.length()-1; i >-1 ; i--) {
            temp=temp+s.substring(i,i+1);
        }
        System.out.println(temp);

        // Ornek 2: size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        String a="selam";
        String tersa="";

        for (int i = a.length()-1; i > -1 ; i--) {
           tersa =tersa+a.charAt(i);
        }
        if(a.equalsIgnoreCase(tersa)){
            System.out.println("polindromdur");
        }else {
            System.out.println("polindrom degildir");
        }

    }
}
