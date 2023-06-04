package day0Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1. /*
        //  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
        //  ve cekme, çıkış işlemlerinin yapıldıgı bir
        //   ATM app. method create ediniz
        //   */


        ATMapp();

    }

    public static void ATMapp() {
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("Toplam bakiyeniz "+bakiye +" tledir.Lutfen yapmak istediginiz islemi seciniz : " +
                "\n Ogrenme icin(500) 1 e " +
                "\n Para yatirma icin 2 ye " +
                "\n Para cekme icin   3 e " +
                "\n Cikamk icin ise   0 a basiniz.");

        int tercih = scan.nextInt();

        if(tercih==1){
            System.out.println("ogrenme islemleriniz gerceklestiriliyor \n kalan bakiyeniz :"+(bakiye-500));
        } else if (tercih==2) {
            System.out.println("lutfen yatirmak istediginiz para miktarini giriniz");
           int add=scan.nextInt();
           bakiye +=add;
            System.out.println("guncel bakiyeniz : " + bakiye);
        } else if (tercih==3) {
            System.out.println("cekmek istediginiz para miktarini giriniz: ");
            int eksi = scan.nextInt();
            bakiye-=eksi;
        }else {
            System.out.println("cikis isleminiz gercekelstirilmistir");
        }
    }
}
