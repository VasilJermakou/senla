package homeworkExceptions.otherExceptions;

import homeworkExceptions.otherExceptions.RegistrationEmailService;
import homeworkExceptions.otherExceptions.Student;
import homeworkExceptions.otherExceptions.StudentManager;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * HomeWork (Topic Exceptions 12.03.2021)
         *
         * 1. Написать три своих исключения.
         * 2. Каждое должно логически срабатывать при определенных условиях.
         * 3. Конструкции с исключениями должны включать try / catch / finally.
         * 4. Два из трех могут быть объединенные.
         * 5. Третье в отдельном методе и пробрасывается, т.е. ловится выше.
         *
         * Самим придумать почему исключения срабатывает.
         * Ничего не мудрить, все должно быть просто.
         *
         * */

        System.out.println("===================================");

        /* * * * * * * * * * * * * * *
        * Exception #1
        * Using classes:
        * homeworkExceptions.otherExceptions.EmailException
        * homeworkExceptions.otherExceptions.RegistrationEmailService
        * homeworkExceptions.otherExceptions.Main
        * * * * * * * * * * * * * * */

        List<String> emails = new ArrayList<>();
        emails.add("ivanov@gmail.com");
        emails.add("petrov@gmail.com");
        emails.add("sidorov@gmail.com");

        RegistrationEmailService regService = new RegistrationEmailService(emails);
        regService.registrateEmail("ermakov@yandex.by");        //add

        for(String s : emails){
            System.out.println(s);
        }

        //regService.registrateEmail("ivanov@gmail.com");         //throw homeworkExceptions.otherExceptions.EmailException

        System.out.println("===================================");

        /* * * * * * * * * * * * * * *
         * Exception #2
         * Using classes:
         * homeworkExceptions.otherExceptions.Student
         * homeworkExceptions.otherExceptions.StudentIDNotFoundException
         * homeworkExceptions.otherExceptions.StudentManager
         * homeworkExceptions.otherExceptions.Main
         * * * * * * * * * * * * * * */

        Student student1 = new Student("Anderson", 100);
        Student student2 = new Student("Olafson", 101);
        Student student3 = new Student("Henrikson", 102);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentManager.checkStudentById(students, 100); //ID 100 exist
        //homeworkExceptions.otherExceptions.StudentManager.checkStudentById(students, 99);  //homeworkExceptions.otherExceptions.StudentIDNotFoundException: ID not found!

        System.out.println("===================================");

    }//main ends
}//class ends
