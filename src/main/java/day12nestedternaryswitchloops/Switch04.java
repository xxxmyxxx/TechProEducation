package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ulke ismi giriniz :");
        String ulke=scan.nextLine();


        switch (ulke.toLowerCase()){
            case "amerika":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("Al");
                break;
            case "france":
                System.out.println("FR");
                break;
            default :
                System.out.println("bu ulke tanimli degildir");


        }
    }
}
