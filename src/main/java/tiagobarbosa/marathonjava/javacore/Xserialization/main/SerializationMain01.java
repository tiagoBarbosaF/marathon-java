package tiagobarbosa.marathonjava.javacore.Xserialization.main;

import tiagobarbosa.marathonjava.javacore.Xserialization.domain.SchoolClass;
import tiagobarbosa.marathonjava.javacore.Xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationMain01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Tiago Barbosa", "123456");
        SchoolClass schoolClass = new SchoolClass("Class 01-03");
        student.setSchoolClass(schoolClass);
        serialize(student);
        deserialize();
    }

    private static void serialize(Student student) {
        Path path = Paths.get("folder/student.ser");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            outputStream.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        Path path = Paths.get("folder/student.ser");
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
