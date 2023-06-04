package day11nestedifternaryincrementdecrement;

public class IncDecExample {
    public static void main(String[] args) {
        int once = 17;
        System.out.println("once = " + once);
        int sonra = once++; // gordugu gibi yapmis eylemi

        System.out.println("sonra = " + sonra);
        System.out.println("once = " + once);

        System.out.println("-----------------");

        int first =5 ;
        System.out.println("first = " + first);
        int second = ++first;
        System.out.println("second = " + second);
        System.out.println("first = " + first);


    }
}
