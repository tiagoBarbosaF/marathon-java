package tiagobarbosa.marathonjava.javacore.Gassociation.main;

import tiagobarbosa.marathonjava.javacore.Gassociation.domain.School;
import tiagobarbosa.marathonjava.javacore.Gassociation.domain.Teacher;

public class SchoolMain01 {
    public static void main(String[] args) {
        Teacher teacher01 = new Teacher("John");
        Teacher teacher02 = new Teacher("Mary");
        Teacher[] teachers = {teacher01, teacher02};

        School school = new School("Harvard", teachers);

        school.print();
    }
}
