package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic =new Civic();
        myCivic.cool(); //Civic cools perfectly
        myCivic.run(); // AC runs super
        myCivic.eco(); //Uses gas less

        Engine.stop(); //Stops securely

        Accord myAccord = new Accord();
        myAccord.cool(); //Accord cools super
        myAccord.run(); //Engine runs super

        System.out.println("Ac.price = " + Ac.price);
        System.out.println("Engine.price = " + Engine.price);
        System.out.println("Security.price = " + Security.price);


    }
}
