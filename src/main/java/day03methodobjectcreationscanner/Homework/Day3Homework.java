package day03methodobjectcreationscanner.Homework;

public class Day3Homework {

 public static void main (String []args){
     double radius = 3 ;
     System.out.println("radius = " + radius);
     double pi = 3.14 ;
     double circleCircumfrence = radius*pi*2;

     double circleArea = radius*radius*pi;

     calculateCircleArea(circleArea);

     calculateCircleCircumference(circleCircumfrence);
    }

    private static void calculateCircleArea(double circleArea) {
        System.out.println("circleArea   = " + circleArea);
    }

    private static void calculateCircleCircumference(double circumfrence) {
        System.out.println("circumfrence = " + circumfrence);
    }


}
