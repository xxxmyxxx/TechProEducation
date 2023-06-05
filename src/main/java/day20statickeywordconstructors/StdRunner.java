package day20statickeywordsconstructors;

public class StdRunner {
    public static void main(String[] args) {

        System.out.println(Student.stdName);

        Student std1 = new Student();
        System.out.println(std1.age);

        Student std2 = new Student();

        Student.staticMethod();
        std2.nonStaticMethod();



    }
}
