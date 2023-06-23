package day31mapsexceptions;

public class E03 { // StringIndexOutOfBoundsException
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s,2); // v

        String t = "Java";
        getCharFromString(s,4);


    }
// Stringlerde var olmayan indexler kullanildiginda StringIndexOutOfBoundsException atar
    // ctrl + alt + t  kisa yol
    public static void getCharFromString(String s, int idx) {
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Index disina ciktiniz... " + e.getMessage());//Index disina ciktiniz... String index out of range: 4
            System.out.println(e.getCause());// null (eger tanimliysa hatanin nedenini verir)
            e.printStackTrace(); // kirmizi sorunlu hatayi gormeyi saglar
            /*
            java.lang.StringIndexOutOfBoundsException: String index out of range: 4
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	at java.base/java.lang.String.charAt(String.java:693)
	at day31mapsexceptions.E03.getCharFromString(E03.java:17)
	at day31mapsexceptions.E03.main(E03.java:9)
             */

            System.out.println("kod calismaya devam etti");
        }
    }
}
