package day29collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
        // Ornek Ogrenci email adreslerini natural order da siralanmis olarak depolayiniz.

        long t1 =System.nanoTime();

        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("e@gmail.com");
        emails.add("m@gmail.com");
        emails.add("p@gmail.com");
        emails.add("h@gmail.com");


        System.out.println(emails); //[a@gmail.com, e@gmail.com, h@gmail.com, m@gmail.com, p@gmail.com, z@gmail.com]
        //2.way

        long t2 =System.nanoTime();

        HashSet<String>emailsHs= new HashSet<>();
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("m@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("h@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);

        long t3 =System.nanoTime();

        System.out.println("TreeSet hizi ="+(t2-t1));
        System.out.println("HashSet hizi ="+(t3-t2));


    }


}
