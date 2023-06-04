package day15loops;

import java.util.Scanner;

public class DoWhileLoop03Tekrar {
    public static void main(String[] args) {
            /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
        Scanner input = new Scanner(System.in);
        int sayac = 0;

        do{
            if(sayac==4){
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }

            System.out.print("name : ");
            String name = input.next();
            System.out.print("pass : ");
            String pass = input.next();

            if(name.equals("abuzer") && pass.equals("kadayif")){
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            sayac++;
            int kalan=4-sayac;

            System.out.println("Kalan Hakkkiniz: "+kalan);
            if(kalan==1){
                System.out.println("Dikkat edin bu son hakkiniz");
            }

        }while (true);

    }
}
