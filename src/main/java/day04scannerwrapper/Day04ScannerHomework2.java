package day04scannerwrapper;

import java.util.Scanner;

public class Day04ScannerHomework2 {
    // 2 ) Kullanıcıdan aldığın 3 basmaklı sayının rakamları toplamı
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three digit number : ");
        int number = input.nextInt();

        int onesDigit = number % 10;
        number = number / 10;

        int tensDigit = number % 10;
        number = number / 10;

        int hundredsDigit = number % 10;
        number = number / 10;

        System.out.println("Total of steps = "+(onesDigit + tensDigit + hundredsDigit));


    }
}
