package day18multidimensionalarray;

public class PassByValue01 {
    // orginal degeri korumak icin ortaya cikmistir
    //
    public static void main(String[] args) {
        int shirtPrice=100;

        System.out.println(discount("student", shirtPrice));
        System.out.println("shirtPrice = " + shirtPrice);


    }
    public static int discount(String type, int price){
        switch (type){
            case "student":
                price=price-10;
                break;
            case "veteran":
                price-=20;
                break;
            case "senior":
                price-=5;
                break;
            default:
                price=price;

        }
        return price;
    }
}
