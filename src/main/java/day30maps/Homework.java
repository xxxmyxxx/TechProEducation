package day30maps;

import java.util.*;

public class Homework {
    /*
        Home work:
        Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
         */
    public static void main(String[] args) {
        String s = "Hello Henry!";

        howManyTimesRepeated(s);
    }

    public static void howManyTimesRepeated(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s); // HelloHenry

        HashMap<String, Integer> occ = new HashMap<>();

        String letters[] = s.split("");

        System.out.println(Arrays.toString(letters));// [H, e, l, l, o, H, e, n, r, y]


        for (String w : letters) {
            Integer value = occ.get(w);


            if (value == null) {
                occ.put(w,1);
            }else {
                occ.replace(w,value+1);
            }
        }
        System.out.println(occ); //{r=1, e=2, H=2, y=1, l=2, n=1, o=1}

        HashSet<String> harfler =new LinkedHashSet<>(List.of(letters));

        for (String w: harfler) {

            int deger=occ.get(w);
            System.out.print(w + "="+ deger+", ");
        }
    }
}
