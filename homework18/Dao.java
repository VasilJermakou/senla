import java.util.List;

public interface Dao {

    User create(User user);
    User read(String name, String password);
    User update(String name, String newUser);
    boolean delete (String name, String password);
    List<User> readAll();

}
