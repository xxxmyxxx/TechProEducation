package day31mapsexceptions;

import static day31mapsexceptions.E03.getCharFromString;

public class E05 { // Coklu catch
    public static void main(String[] args) {
        int a = 12;
        int b =1;
        String s = "Java";
        getCharFromStrings(s,a,b);
    }
    /*
    Try kisminda birden fazla exception olusturma ihtimali olan kod varsa coklu catch kullanabilirsiniz
    Coklu catch kullandiginizda exception classlar arasinda parent child iliskisi yoksa catchlerin sirasi onemli degildir
    Ama coddaki siralamaya uymak tavsiye edilir

    Coklu catch kullandiginizda exception classlar arasinda parent child iliskisi varsa catchlerin sirasi onemlidir
    Child olan class ustte olmalidir.
     */

    public static void getCharFromStrings(String s, int a, int b) {
        try {
            int idx = a/b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not devide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }
    }

}
