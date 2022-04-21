package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.main;

import tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain.PrintStudent;
import tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain.Student;

public class StudentMain01 {
    public static void main(String[] args) {
        Student student01 = new Student("Tiago", 30, 'M');
        Student student02 = new Student("Peter", 20, 'M');
        PrintStudent printStudent = new PrintStudent();

        printStudent.print(student01);
        printStudent.print(student02);
    }
}
