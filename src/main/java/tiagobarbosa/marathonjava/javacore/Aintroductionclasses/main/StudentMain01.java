package tiagobarbosa.marathonjava.javacore.Aintroductionclasses.main;

import tiagobarbosa.marathonjava.javacore.Aintroductionclasses.domain.Student;

public class StudentMain01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.Name = "Tiago";
        student.Age = 36;
        student.Gender = 'M';

        System.out.println("Name: " + student.Name + ", Age: " + student.Age + ", Gender: " + student.Gender);
    }
}
