package day10ifstatements;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*
    Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz

    2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //  1==> January, 2 ==> February .....

*/
        // 1.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pwd = input.next();

        if (pwd.equals("pwd123!")) {
            System.out.println("that's right, you can come in");
        } else {
            System.out.println("get your back and get out");
        }

        // 2.
        Scanner day = new Scanner(System.in);
        System.out.print("Enter day name: ");
        String dayName = day.next();

        if (dayName.equalsIgnoreCase("sunday")) {
            System.out.println("1");
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println("2");
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("3");
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("4");
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("5");
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("6");
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("7");
        } else {
            System.out.println("Please enter a day name...");
        }

        //3.
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a number : ");
        byte num = 0 ;
        try {
            num = scan.nextByte();
        } catch (Exception e) {
            //System.out.println("Please enter a number between 1-12.");
        }


        if (num >= 1 && num <= 12) {
            if (num == 1) {
                System.out.println("January");
            } else if (num == 2) {
                System.out.println("February");
            } else if (num == 3) {
                System.out.println("March");
            } else if (num == 4) {
                System.out.println("April");
            } else if (num == 5) {
                System.out.println("May");
            } else if (num == 6) {
                System.out.println("June");
            } else if (num == 7) {
                System.out.println("July");
            } else if (num == 8) {
                System.out.println("August");
            } else if (num == 9) {
                System.out.println("September");
            } else if (num == 10) {
                System.out.println("October");
            } else if (num == 11) {
                System.out.println("Nevember");
            } else if (num == 12) {
                System.out.println("December");
            } else {
                System.out.println("Please dont do this again..");
            }

        } else {
            System.out.println("Please enter a number between 1-12.");
        }

    }
}
