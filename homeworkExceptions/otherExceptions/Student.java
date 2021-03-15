package homeworkExceptions.otherExceptions;

import java.util.Objects;

public class Student {

    //class fields
    private String name;
    private Integer id;

    //constructor
    public Student(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    //getters
    public String getName() {
        String result = this.name;
        return result;
    }

    public int getId() {
        int result = this.id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "homeworkExceptions.otherExceptions.Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}//class end
