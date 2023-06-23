package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    // ilk giren ilk cikar
    public static void main(String[] args) {
        Queue<String> depo = new LinkedList<>();
        depo.add("Egg");
        depo.add("Milk");
        depo.add("Cheese");
        depo.add("Meat");
        System.out.println(depo); // [Egg, Milk, Cheese, Meat]    // insertion ordara gore siralamis

        depo.remove();
        System.out.println(depo);// [Milk, Cheese, Meat]         // ilk giren ilk cikar

        System.out.println(depo.peek());//Milk       ilk elamni silmeden verir --> copy+paste
        System.out.println(depo.poll());//Milk       ilk elemani silip verir --> cut + paste
        System.out.println(depo.element());//Cheese  liste bos ise eleman kullandigimizda hata verir.

        depo.clear(); // hepsini siler
        System.out.println(depo.poll()); // null
        System.out.println(depo.peek()); // null
//        System.out.println(depo.remove()); // NoSuchElementException
        System.out.println(depo.element()); // NoSuchElementException


    }
}
