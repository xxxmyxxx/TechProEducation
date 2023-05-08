package day03methodobjectcreationscanner.Homework;

public class HomeworkRunner {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher();
        System.out.println(myTeacher.name);
        System.out.println(myTeacher.yas);
        System.out.println(myTeacher.salary);

        System.out.println();

        myTeacher.teach();
        myTeacher.giveHomework();
        myTeacher.countMoney();
    }
}
