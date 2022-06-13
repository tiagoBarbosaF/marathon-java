package tiagobarbosa.marathonjava.javacore.Gassociation.domain;

public class Teacher {
    private String name;
    private String expertise;
    private Seminary[] seminaries;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    public Teacher(String name, String expertise, Seminary[] seminaries) {
        this.name = name;
        this.expertise = expertise;
        this.seminaries = seminaries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public Seminary[] getSeminaries() {
        return seminaries;
    }
}
