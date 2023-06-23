package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        /*
        1) Setler tekrarsiz eleman (unique) depolamak icin kullanilir
        2) 3 tane Set class vardir
           a)HashSet Class :
              "Hash" benzersiz bir id olusturma teknigidir.
              "HashSet" elemanlari siralamadigindan cok hizli calisir.
              "HashSetler" null i eleman olarak kabul eder.(sadece 1 edet null kabul eder cunku tekrarsiz bir yapi)

           b)LinkedHashSet Class;
             "LinkedHasSetler elemanlari sizin verdiginiz siraya gore (insertion order) dizdiklerinden
             HashSet'lere gore yava s calisirlar
             LinkedHashSetler tekrarsiz eleman depolamak icindir

             C) Tree Class:  ( Tree-Natural (agac doga) ilskisinden hatirlamak
               "TreSet" ler elemanlari natural order(kucukten buyuge yada alfabetik sira) a gore dizerler
               En yavas set TreeSet'rir
         3) TreeSet cook yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz
         */
        HashSet<String> hs = new HashSet<>();
        hs.add("Mustafa");
        hs.add("Suat");
        hs.add("Saadet");
        hs.add("Ali");
        hs.add("Veli");
        hs.add("Can");
        hs.add(null);

        // Sirasiz verdi rastgele sirayla koyar ( o yuzden hizli)
        System.out.println(hs); //[null,Can, Mustafa, Suat, Veli, Saadet, Ali]

        hs.add("Mustafa"); // Tekrarli eleman ekledigimizde hata vermedi ama sadece bir kere ekledi
        System.out.println(hs);//[Can, Mustafa, Suat, Veli, Saadet, Ali]

        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(19);
        lhs.add(13);
        lhs.add(-35);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs); //[7, 19, 13, -35,null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(7);
        ls.add(119);
        ls.add(13);
        ls.add(353);
        ls.add(313);


        lhs.retainAll(ls); // Kesisim kumesini verdi,lhs listesini degistirdi.
        System.out.println(lhs);//[7, 13]
        System.out.println(ls);//[7, 119, 13, 353, 313]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('T');
        ts.add('Z');
        //ts.add(null);  // TreeSetlere null eklenemez.
        System.out.println(ts);// [A, B, E, G, L, T, Z]  Natural Order (Dogal Sirasina gore siraldi)
        System.out.println(ts.first()); // A
        System.out.println(ts.last()); // Z

        System.out.println(ts.lower('E')); // B --> // Verilen eleman olan E bir oncekini verir
        System.out.println(ts.lower('F')); // E
        System.out.println(ts.lower('F')); // null

        System.out.println(ts.higher('L'));//T --> // Verilen eleman olan L den bir sonraki elemani verir
        System.out.println(ts.higher('N'));//T --> // Verilen eleman olan L den bir sonraki elemani verir

        System.out.println(ts.headSet('G')); // [ A,B,E ]   // Verilen karakterin oncesini veriyor(kendisini haric)
        System.out.println(ts.headSet('G',true));//[A, B, E, G]   // Kendisi dahil

        System.out.println(ts.tailSet('L'));  // [L, T, Z] kendisi dahil.
        System.out.println(ts.tailSet('L',false));  // [T, Z] kendisi haric

        System.out.println(ts.ceiling('T'));//T   // ceiling = tavan
        System.out.println(ts.ceiling('O'));//T   // ceiling = tavan yoksa nerde olurdu?
                                                    // en yakini sonrasini veriyor yani..

        System.out.println(ts.floor('B')); //B     Varsa kendisi
        System.out.println(ts.floor('D')); //B     Yoksa bi onceki

        System.out.println(ts.subSet('B', 'L'));// [B, E, G]  substring metodu gibi ilk index haric son index haric
        System.out.println(ts.subSet('B',false,'L',true));
        // [E, G, L] folse yazilan haric
        // true yazilan dahil


    }
}
