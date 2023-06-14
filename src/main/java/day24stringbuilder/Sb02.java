package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);// Java is easy
        sb1.reverse();// String in ters cevirilmesi looplar ilede yapilir bu kisa yoldur
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);
        System.out.println(sb1); // Verilen indexteki karakteri siler

        sb1.delete(0,6);
        System.out.println(sb1);

        sb1.replace(0,4,"halo");
        System.out.println(sb1);

        sb1.insert(3,"XXX");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Hava");

        //sonuc 0 ise alfabetik olarak ayni siradalardir
        //sonuc -1 ise sb2 sb3 ten alfabetik olarak bir onde demektir.
        //sonuc 1 ise sb2 sb3 ten alfabetik olarak bir sonra demektir.

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        //StringBuilder nasil string e cevrilir?
        String str= sb2.toString().toUpperCase();
        System.out.println(str);
    }
}
