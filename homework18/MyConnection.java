import java.sql.*;
import java.util.Objects;

public class MyConnection {

    //class fields
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/senlaapp";
    //public static Statement statement;
    public static Connection connection;
    public static PreparedStatement preparedStatement;

    static{
        try{
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //#1
    public static void insertUser(String login, String password) throws SQLException {
        preparedStatement = connection.prepareStatement("INSERT INTO user (username, password) VALUES (?, ?)");
        preparedStatement.setString(1, login);
        preparedStatement.setString(2, password);
        preparedStatement.execute();
    }

    //#2.0
    public static void read() throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT username, password from user");
        ResultSet resultSet = preparedStatement.executeQuery();
        String name;
        String passwordUser;
        while (resultSet.next()){
            name = resultSet.getString("username");
            passwordUser = resultSet.getString("password");
            System.out.println("===================================");
            System.out.println(name);
            System.out.println(passwordUser);
        }
    }

    //#2.1
    public static void read(String username, String password) throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT * from user WHERE username = ? && password = ?");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        preparedStatement.execute();
        ResultSet resultSet = preparedStatement.executeQuery();
        String name;
        String passwordUser;
        while (resultSet.next()){
            name = resultSet.getString("username");
            passwordUser = resultSet.getString("password");
            System.out.println("===================================");
            System.out.println(name);
            System.out.println(passwordUser);
        }
    }

    //#3
    public static void update(String username, String password, String id) throws SQLException {
        preparedStatement = connection.prepareStatement("UPDATE user SET username = ?, password = ? WHERE id = ?");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        preparedStatement.setString(3, id);
        preparedStatement.execute();
    }

    //#4
    public static void delete(String username, String password) throws SQLException {
        preparedStatement = connection.prepareStatement("DELETE FROM user WHERE username=? AND password=?");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        preparedStatement.execute();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");     //com.mysql.jdbc.Driver
        User user1 = new User("TESTNAME1", "TESTPASSWORD1");

        //#1
        //MyConnection.insertUser(user1.getUserName(), user1.getPassword());
        System.out.println("\n");

        //#2
        MyConnection.read();
        System.out.println("\n");

        //#3
        MyConnection.read("Joe Black", "654321");
        System.out.println("\n");

        //#4
        MyConnection.update("newUser", "753951", "10");
        System.out.println("\n");

        //#5
        MyConnection.delete("newUser", "753951");

    }//main ends

}//class ends

