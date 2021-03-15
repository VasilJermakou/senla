package homeworkExceptions.otherExceptions;

import homeworkExceptions.otherExceptions.EmailException;

import java.util.List;

public class RegistrationEmailService {

    //class fields
    List<String > emails;

    //constructors
    public RegistrationEmailService(List<String> list){
        this.emails = list;
    }

    //methods
    public void registrateEmail(String email) throws EmailException {
        if(this.emails.contains(email)){
            throw new EmailException("This email already exist!");
        }else
            this.emails.add(email);
    }
}
