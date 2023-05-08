package day04scannerwrapper;

import java.util.Scanner;

public class Day04ScannerHomework {
    // 1 ) Kullanıcıdan aldığınız 3 tane sayının ortalaması alın
    // 2 ) Kullanıcıdan aldığın 3 basmaklı sayının rakamları toplamı


    public static void main(String[] args) {
        // 1. homework

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int number1 = input.nextInt();
        System.out.print("Enter the 1nd number : ");
        int number2 = input.nextInt();
        System.out.print("Enter the 1rd number : ");
        int number3 = input.nextInt();

        System.out.println("Girdiginiz 3 sayinin ortalamasi : "+(number1+number2+number3)/3);


        //2. ödev

    }


}
