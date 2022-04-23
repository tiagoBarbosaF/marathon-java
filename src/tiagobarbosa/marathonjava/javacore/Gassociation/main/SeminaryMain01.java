package tiagobarbosa.marathonjava.javacore.Gassociation.main;

import tiagobarbosa.marathonjava.javacore.Gassociation.domain.Local;
import tiagobarbosa.marathonjava.javacore.Gassociation.domain.Seminary;
import tiagobarbosa.marathonjava.javacore.Gassociation.domain.Student;
import tiagobarbosa.marathonjava.javacore.Gassociation.domain.Teacher;

public class SeminaryMain01 {
    public static void main(String[] args) {
        Local local = new Local("Street 01", 1010);
        Seminary seminary = new Seminary("Technology", local);

        Student student01 = new Student("John Snow", 14);
        Student student02 = new Student("Bob Billy", 16);
        Student student03 = new Student("Mary Pops", 15);
        Student student04 = new Student("Tiago", 15);
        Student[] students = {student01, student02, student03, student04};

        Teacher teacher01 = new Teacher("Skywalker", "Physics");
        Teacher teacher02 = new Teacher("Walter White", "Science");
        Teacher teacher03 = new Teacher("Indiana Jones", "History");
        Teacher[] teachers = {teacher01, teacher02, teacher03};

        seminary.setStudents(students);
        seminary.setTeachers(teachers);

        seminary.print();
    }
}
