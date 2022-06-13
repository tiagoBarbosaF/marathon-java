package tiagobarbosa.marathonjava.javacore.Xserialization.domain;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = -4960287994264599047L;
    private Long id;
    private String name;
    private transient String password;
    private static final String SCHOOL_NAME = "Springfield HighSchool";
    private transient SchoolClass schoolClass;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream outputStream){
        try {
            outputStream.defaultWriteObject();
            outputStream.writeUTF(schoolClass.getName());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream inputStream){
        try{
            inputStream.defaultReadObject();
            String className = inputStream.readUTF();
            schoolClass = new SchoolClass(className);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL_NAME='" + SCHOOL_NAME + '\'' +
                ", School class='" + schoolClass + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}
