package day03methodobjectcreationscanner;

public class MyMethodPratices {
    public static void main(String[] args) {
        //method oluşturma kısa yolu

        String str = "Selam"; // önce yaz variable ı
        printConsole(str); // sonra method varmış gibi yaz parametresinide yaz

        int x = 5 ;
        calculateKare(x);

    }

    private static void calculateKare(int x) {
        System.out.println("Karesi = " + x * x);
    }

    private static void printConsole(String str) {
        System.out.println(str); // sonra gel buraya public private mi onu yaz bide return type ını yaz tamam bu kadar.
    }

}
