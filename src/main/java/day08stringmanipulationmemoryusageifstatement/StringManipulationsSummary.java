package day08stringmanipulationmemoryusageifstatement;

public class StringManipulationsSummary {
    public static void main(String[] args) {
        String s = "Java is easy  ";
        String n = "123";

        s.toUpperCase();             // "  JAVA IS EASY  "
        s.toLowerCase();             // "  java is easy  "
        s.charAt(0);                 //
        s.length();
        s.substring(0, 4);
        s.contains("money");
        s.startsWith("Java");
        s.endsWith("easy");
        s.replace("easy", "hard");
        s.replaceAll("[0-9]", "*");
        s.trim();
        System.out.println(n.valueOf(n));
        s.split(" "); // java ve is arasindaki boslugu sildi ve ikiye boldu

        s.equalsIgnoreCase(n); // buyuk harf kucuk harf gormezden gel demek
        s.isEmpty(); //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        s.isBlank(); //isBlank() methodu bos stringler icin de true verir
                     // isBlank() methodu space + hic birsey icin true veri
                     // isEmpty() methodu sadece hic birsey icin true verir.
        s.indexOf("is"); // is kacinci siradan basliyor
        s.lastIndexOf('a'); // a nin en son goruldugu indexi yazar,yoksa -1 yazdirir.
        s.substring(0, 4); // beginIndex endIndex arasindaki yaziyi gosterir.
        s.equals(n); // esit mi degil mi?


    }
}
