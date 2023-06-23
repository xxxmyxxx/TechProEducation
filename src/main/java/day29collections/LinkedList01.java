package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();

        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        System.out.println(s); // [Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        //LinkListlerin en basarili isleri ekleme ve silme tamda bu yuzden bu konuda bir suru method overloading yapilmis.

//        s.remove(3);
//        System.out.println(s); //[Nuriye, Orhan, Bunyamin, Niyazi, Bilal, Abdullah, Nuriye]
//
//        s.remove(); // ilk indeksi siliyor
//        System.out.println(s); //[Orhan, Bunyamin, Niyazi, Bilal, Abdullah, Nuriye]
//
//        s.remove("Orhan");
//        System.out.println(s);// [Bunyamin, Niyazi, Bilal, Abdullah, Nuriye]

//        s.removeFirstOccurrence("Nuriye"); // ilk gorunumu siler
//        System.out.println(s);

//        s.removeLastOccurrence("Nuriye"); // son gorunumu siler
//        System.out.println(s);

        /*
        Retrieves (alir gelir) , but does not remove (ama silmez), the head (first element) of this list.(ilk elemani)
        Returns:
        the head of this list(ilk elemen), or null if this list is empty (list bossa null)
         */
        String r1 = s.peek(); // Bu size ilk node u silmeden verir (copy + paste)
        System.out.println(r1); //Nuriye
        System.out.println(s); //[Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /*
        Retrieves and removes the head (first element) of this list.
        Returns:
        the head of this list, or null if this list is empty
         */

        String r2 = s.poll(); // Ilk elemani silip geri dondermis. (cut + paste)
        System.out.println(r2);// Nuriye
        System.out.println(s); // [Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:
       the head of this list  NoSuchElementException

       NOTE : peek() ile element() ikiside size ilk elemani silmeden verir.
       Ama peek() list bos oldugunda size null verir. element() ise hata verir.
         */

        String r3=s.element();  // (copy paste) List Bos oldugunda hata verir.
        System.out.println(r3); // Orhan
        System.out.println(s); // [Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

        /*
        poll() ile pop() methdodlari arasinda ikiside ilk elemani siler ve size verir
        ama poll() list bos oldugunda size null verir. pop() hata verir.
         */

        String r4=s.pop(); // (cut + paste)
        System.out.println(r4); // Orhan
        System.out.println(s); // [Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]


    }
}