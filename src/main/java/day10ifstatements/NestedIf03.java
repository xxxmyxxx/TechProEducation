package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {

        /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Paswordunuzu giriniz : ");
        String pwd = input.nextLine();

        if (pwd.charAt(0)>= 'A' && pwd.charAt(0)<='Z'){     // ilk harf buyuk harf ise
            if (pwd.charAt(0)=='A'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("gecersizz cunku buyuk harf ama A degil");
            }

        }else if(pwd.charAt(0)>= 'a' && pwd.charAt(0)<='z'){  // ilk harf kucuk harf ise
            if (pwd.charAt(0)=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("gecersizz cunku kucuk ama z degil");
            }

        }else {
            System.out.println("ilk karakter harf giriniz");
        }
    }
}