package tiagobarbosa.marathonjava.javacore.Aintroductionclasses.main;

import tiagobarbosa.marathonjava.javacore.Aintroductionclasses.domain.Teacher;

public class TeacherMain01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.Name = "John";
        teacher.Age = 40;
        teacher.Gender = 'M';

        System.out.println("Name: " + teacher.Name + ", Age: " + teacher.Age + ", Gender: " + teacher.Gender);
    }
}
