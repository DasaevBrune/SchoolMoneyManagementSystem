import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1,"Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher peter = new Teacher(3, "Peter", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(peter);

        Student tamasha = new Student(1,"Tamasha", 4);
        Student dasaev = new Student(2, "Dasaev", 12);
        Student abbi = new Student(3, "Rabbi", 8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(dasaev);
        studentList.add(abbi);

        School ghs = new School(teacherList, studentList);

        System.out.println("----------------- MAKE STUDENTS PAY FEES ------------------");
        tamasha.payFees(5000);
        System.out.println(tamasha);
        dasaev.payFees(6000);
        System.out.println(dasaev);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("----------------- MAKING SCHOOL PAY SALARY --------------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        peter.receiveSalary(peter.getSalary());
        System.out.println("GHS has spent for salary to " + peter.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(lizzy);
        System.out.println(peter);

    }

}