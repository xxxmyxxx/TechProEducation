package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[]args){
        //object nasıl oluşturulur
        //new keywordu sıfırdan yeni bir obje oluşturmak için kullanılır
        //Constructor javada objeleri oluşturmak için kullanılanılır.
        // class ismi + obje ismi +Assigment Operator + new keywordu + Constructor
             Car          myCar              =            new             Car();
        Car sahin = new Car();
        System.out.println("sahin fiyat = " + sahin.fiyat);
        System.out.println("sahin.model = " + sahin.model);

        sahin.hareket();
        sahin.dur();

        System.out.println();

        Student aliCan = new Student();
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.feed();
        aliCan.study();

    }
}
