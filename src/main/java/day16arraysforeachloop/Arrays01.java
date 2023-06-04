package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 13;
        // Bu yapinin icinde sadece 1 tane data depolanabilir.
        // Ama biz code yazarken bir yapinin icinde colu depolama ihtiyaci hissederiz
        // Bir yapininicinde coklu data depolayabilmek icin java Array yapisini olusturmustur

        //Array nasil olusturulur ?
        String stdNames []=new String[5];

        //Arrayler console a nasil yazdirilir ?
        //toString metodunu kullanmadan yazdirilirsa array adresini verir

        System.out.println(Arrays.toString(stdNames));
        /*
         Arrayler diger collectionlardan cok cok daha hizlidir(superfast)
         Arrayler diger collectionlardan daha az memory kullanirlar.
         */

        //Array e eleman ekleme nasil yapilir?
        stdNames[2]="mustafa";
        System.out.println(Arrays.toString(stdNames));

        System.out.println(stdNames[2]);

        // Ornek 1 : Arraydeki her bir eleman " ! " isareti koyunuz.
        // length() stringlerde method (parantexli),arraylerde ise parantezsiz yazilir(method degil)
        for( int i = 0; i < stdNames.length; i++ ){
            System.out.println(stdNames[i] + "!");
        }

    }
}
