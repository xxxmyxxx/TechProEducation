package day03methodobjectcreationscanner.Homework;

public class Teacher {
    public String name = "Mehmet";
    public byte yas = 33;
    public long salary = 12000000;

    public void teach() {
        System.out.println("Mehmet Teacher teaches by reading the student's brain");
    }
    public void giveHomework(){
        System.out.println("Think about " +getClass().getPackage().getName()+" and give homework");
    }
    public void countMoney(){
        System.out.println("Mehmet Teacher counts " + salary + " dolar");
    }
}
