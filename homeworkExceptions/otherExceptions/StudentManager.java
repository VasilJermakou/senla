package homeworkExceptions.otherExceptions;

import homeworkExceptions.otherExceptions.Student;
import homeworkExceptions.otherExceptions.StudentIDNotFoundException;

import java.util.List;

public class StudentManager {

    public static boolean checkStudentById(List<Student> students, Integer id){
        boolean containID = false;
        boolean flagException = true;

        for(Student s : students){
            if(s.getId() == id){
                containID = true;
                flagException = false;
                System.out.println("ID " + id + " exist");
                return  containID;
            }
        }

        if(flagException){
            throw new StudentIDNotFoundException("ID not found!");
        }
        return containID;
    }

}//class end
