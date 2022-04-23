package tiagobarbosa.marathonjava.javacore.Gassociation.domain;

public class Seminary {
    private String name;
    private Local local;
    private Student[] students;
    private Teacher[] teachers;

    public Seminary(String name, Local local) {
        this.name = name;
        this.local = local;
    }

    public Seminary(String name, Local local, Student[] students, Teacher[] teachers) {
        this.name = name;
        this.local = local;
        this.students = students;
        this.teachers = teachers;
    }

    public void print() {
        System.out.println("-- Seminary: " + this.name + " --");
        if (students == null || teachers == null || local == null) return;

        System.out.println("Local: "+this.local.getStreet()+", "+this.local.getNumber());
        System.out.println("\n  - Students - ");
        for (Student student : students) {
            System.out.println("Name: "+student.getName()+", Age: "+student.getAge());
        }
        System.out.println("\n  - Teachers - ");
        for (Teacher teacher : teachers) {
            System.out.println("Name: "+teacher.getName()+", Expertise: "+teacher.getExpertise());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
