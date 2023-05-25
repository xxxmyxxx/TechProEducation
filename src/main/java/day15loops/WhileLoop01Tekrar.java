package day15loops;

public class WhileTekrar {
    public static void main(String[] args) {
        //Ornek 1: 3 den 6 ya kadar tamsayilari console a yazdirin

        int a=3;

        while (a<7){
            System.out.println(a);
            a++;
        }
        // Ornek 2: 23 den 12 ye kadar cift tamsayilari console a yazdiriniz

        int i=23;

        while (i>11){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i--;
        }

        // Ornek 3: 6 dan 19 a kadar tek tamsayilari console a yazdiriniz
        System.out.println();
        int z = 6;

        while (z < 19) {

            if(z%2!=0){
                System.out.print(z + " ");
            }
            z++;
        }
    }
}
