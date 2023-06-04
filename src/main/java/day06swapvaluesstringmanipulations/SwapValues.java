package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        int a = 12;
        int b = 5; // Swap'dan sonra --> a = 5 , ve b = 12;
        int temp = 0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 1.Adim boş kovaya a'yı at
        temp = a;

        // 2.Adim a yı al b yap (a yalan oldu,şimdi napıcaz şimdi boş kovadaki ayı alacaz)
        a = b;

        // 3.Adim
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 2.Yol
        int elma = 12;
        int armut=5;

          elma = elma + armut;
        // 12  = 12  +  5
        //elma artık 17



    }
}
