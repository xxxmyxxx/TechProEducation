package day31mapsexceptions;

public class E02 { //NumberFormatException

    public static void main(String[] args) {
        String s = "1234";
        convertStringToInt(s);

        String t = "123a";
        convertStringToInt(t);

    }
// Icinde rakamlar disinda karakter olan bir string i sayiya cevirmek isterseniz NumberFormatException alirsiniz.
    public static void convertStringToInt(String s) {
        try{
            Integer intS = Integer.valueOf(s);
            System.out.println(intS + 1);

        }catch (NumberFormatException e){
            System.out.println("Rakam disi karakter olamaz");
            System.out.println(e.getMessage());
        }

    }
}
