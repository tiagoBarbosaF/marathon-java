package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain;

public class Person {
    private String Name;
    private int Age;

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.Age;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void print() {
        System.out.println("Person -> Name: " + this.Name + ", Age: " + this.Age);
    }
}
