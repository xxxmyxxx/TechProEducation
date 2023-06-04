package day06swapvaluesstringmanipulations;

public class SwapExample {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        a = a + b;
        // 12 = 12 + 5
        // a = 17; şuan

        b = a - b;
        //5 = 17-5;
        //b =12 şuan

        a = a - b;
        //  a = a - b
        // 17 = 17-12
        // a= 5 şuan

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // example 2

        int x = 3 ;
        int y = 4 ;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
