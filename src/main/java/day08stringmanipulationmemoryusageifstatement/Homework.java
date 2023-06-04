package day08stringmanipulationmemoryusageifstatement;

public class Homework {
    public static void main(String[] args) {
        // 1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz

        String pass = "128MG628...!";

        int numberOfAllNonDigitCharacters = pass.replaceAll("[0-9]", "").length();
        System.out.println("numberOfAllNonDigitCharacters = " + numberOfAllNonDigitCharacters);

        // 2) Bir String variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz

        String s = "the future is in the sky";
        String orta= s.substring(1,s.length()-1).toUpperCase();
        char ilk=s.charAt(0);
        char son=s.charAt(s.length()-1);
        System.out.println(ilk+orta+son);

        // 3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz

        String kelime= "kelime";





    }
}
