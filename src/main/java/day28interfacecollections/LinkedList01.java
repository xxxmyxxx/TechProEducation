package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        //ArrayListler eleman silme ve eklemede tekrar indekleme yapmak zorunda olduklarindan elemena ekleme ve silmede kotuler.
        //Arama isleminde array listler daha iyidir cunku index var adres var.

        List<String> list2 = new ArrayList<>();
        //LinkedListler index kullanazlar bu yuzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz
        //LinkedListlerde linkedlislerde node ekleme ve silme islemleri yaparken sadece pointerlar degistirilir.
        //Search isleminde kotu cunku,tek tek bu sende var mi diye soruyor.


        /*
        1) ArrayListler eleman ekleme ve silme islemlerinde basarisizdirlar
            o yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2) LinkedListler index kullanmadiklarindan node silme ve eklemede re-index yapilmasina gerek yoktur
            Bu da LinkedListleri eleman ekleme ve silmede cok basarili hale getirir
            Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda linkedlist kullanmak tavsiye edilir
        3) ArrayList lerde search islemi kolay yapilir cunku indexler adres gibidir
        4) LinkedListlerde search islemi zor yapilir cunku linkedlistler index kullanmaz, index kullanmayinca herhangi bir elemani bulmak icin
            en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");
        s.add(2,"Omer");
        s.addFirst("Mahmut Tuncer");
        s.addLast("Emin");
        System.out.println(s);//[Mahmut Tuncer, Nuriye, Orhan, Omer, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye, Emin]
    }
}
