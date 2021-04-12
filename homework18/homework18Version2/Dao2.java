package homework18Version2;

import java.util.List;

public interface Dao2 {

    String create(User2 user2);
    boolean read(String name);
    boolean update(String name, String password, String ID);
    boolean delete (String name, String password);
    List<User2> readAll();
}
