package homework18Version2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao2Impl implements Dao2{

    /* methods */
    @Override
    public String create(User2 user2) {
        try {
            MyConnection2.preparedStatement = MyConnection2.connection.prepareStatement("INSERT INTO user (username, password) VALUES (?, ?)");
            MyConnection2.preparedStatement.setString(1, user2.getUserName());
            MyConnection2.preparedStatement.setString(2,user2.getPassword());
            MyConnection2.preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "An entry with parameters " + user2.getUserName() + ", " + user2.getPassword() + " has been made to the database";
    }

    @Override
    public boolean read(String userName) {
        boolean resultOperation = false;
        try {
            MyConnection2.preparedStatement = MyConnection2.connection.prepareStatement("SELECT * from user WHERE username = ?");
            MyConnection2.preparedStatement.setString(1, userName);
            MyConnection2.preparedStatement.execute();
            ResultSet resultSet = MyConnection2.preparedStatement.executeQuery();
            String name = "";
            if(resultSet.next()){
                name = resultSet.getString("username");
                resultOperation = true;
                System.out.println("The required equivalent is found!");
            }else
                System.out.println("Required equivalent not found");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultOperation;
    }

    @Override
    public boolean update(String userName, String password, String ID) {
        boolean resultOperation = false;
        try {
            MyConnection2.preparedStatement = MyConnection2.connection.prepareStatement("UPDATE user SET username = ?, password = ? WHERE id = ?");
            MyConnection2.preparedStatement.setString(1, userName);
            MyConnection2.preparedStatement.setString(2, password);
            MyConnection2.preparedStatement.setString(3, ID);
            resultOperation = MyConnection2.preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultOperation;
    }

    @Override
    public boolean delete(String userName, String password) {
        boolean resultOperation = false;
        try {
            MyConnection2.preparedStatement = MyConnection2.connection.prepareStatement("DELETE FROM user WHERE username=? AND password=?");
            MyConnection2.preparedStatement.setString(1, userName);
            MyConnection2.preparedStatement.setString(2,password);
            resultOperation = MyConnection2.preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  resultOperation;
    }

    @Override
    public List<User2> readAll() {
        //return null;
        List<User2> users = new ArrayList<>();
        try {
            MyConnection2.preparedStatement = MyConnection2.connection.prepareStatement("SELECT username, password from user");
            ResultSet resultSet = MyConnection2.preparedStatement.executeQuery();
            String name = "";
            String password = "";
            while (resultSet.next()){
                name = resultSet.getString("username");
                password = resultSet.getString("password");
                users.add(new User2(name, password));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  users;
    }
}//class ends
