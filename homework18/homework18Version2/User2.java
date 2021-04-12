package homework18Version2;

import java.util.Objects;

public class User2 {

    /* class fields */
    private int ID;
    private String userName;
    private String password;

    /* constructors */
    public User2(){
        this.ID = 0;
        this.userName = "No name";
        this.password = "000000";
    }

    public User2(String userName, String password){
        this.ID = 0;
        this.userName = userName;
        this.password = password;
    }

    /* getters and setters */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user2 = (User2) o;
        return ID == user2.ID && Objects.equals(userName, user2.userName) && Objects.equals(password, user2.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, userName, password);
    }

    @Override
    public String toString() {
        return "User2{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}//class ends
