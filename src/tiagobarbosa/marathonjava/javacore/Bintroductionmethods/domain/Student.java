package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain;

public class Student {
    public Student(String name, int age, char gender) {
        Name = name;
        Age = age;
        Gender = gender;
    }

    public String Name;
    public int Age;
    public char Gender;

    public void print() {
        System.out.println("Student -> Name: " + this.Name + ", Age: " + this.Age + ", Gender: " + this.Gender);
    }
}
