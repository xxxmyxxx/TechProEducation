package day15loops;


import java.util.Scanner;

public class WhileLoop02Tekrar {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi yapistir: ");
        int num=scan.nextInt();
        int n = 1;
        while (n<11){
            System.out.println(num +"x"+n+"="+num*n);
            n++;
        }

        //Example 2: Verilen bir string de her harfin sonrasina "*" sembolunu ekleyiniz
        //       Java ==> J*a*v*a*
        Scanner input = new Scanner(System.in);
        System.out.print("bir kelime yapistir: ");
        String s = input.next();

        String temp = "";
        int i = 0;

        while (i<s.length()){
            char ch =s.charAt(i);
            temp=temp+ch+"*";
            i++;
        }
        System.out.println(temp);

        //Example 3: Bir String deki tekrarsiz karakterleri console a yazdiriniz

        // kertenkelle ==> rtn

        // indexOf("k") ==> 0   farkli ise tekrarli
        // lastIndexOf("k") ==> 6

        // indexOf("r") ==> 2   ayni ise tekrarsiz
        // lastIndexOf("r") ==> 2

        String st = "kertenkelle";
        String temp1="";
        int a = 0;

        while (a<st.length()){
            if(st.indexOf(st.charAt(a))==st.lastIndexOf(st.charAt(a))){
                temp1 = temp1 + st.charAt(a);
            }
            a++;

        }
        System.out.println(temp1);








    }
}
