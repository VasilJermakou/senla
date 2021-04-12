package homework18Version2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection2 {

    /* class fields */
    public static String USER_NAME = "root";
    public static String PASSWORD = "root";
    public static String URL = "jdbc:mysql://127.0.0.1:3306/senlaapp";
    public static Connection connection;
    public static PreparedStatement preparedStatement;

    /* constructor */
    private MyConnection2(){}

    /*getters & setters*/
    public static String getUserName() {
        return USER_NAME;
    }

    public static void setUserName(String userName) {
        USER_NAME = userName;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        MyConnection2.PASSWORD = PASSWORD;
    }

    public static String getURL() {
        return URL;
    }

    public static void setURL(String URL) {
        MyConnection2.URL = URL;
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        MyConnection2.connection = connection;
    }

    public static PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    public static void setPreparedStatement(PreparedStatement preparedStatement) {
        MyConnection2.preparedStatement = preparedStatement;
    }

    /* object methods */
    public static void run() throws SQLException {
        MyConnection2.connection = DriverManager.getConnection(MyConnection2.URL, MyConnection2.USER_NAME, MyConnection2.PASSWORD);
        System.out.println("MyConnection starts successful!");
    }

    public static void finish() throws SQLException {
        MyConnection2.connection.close();
        System.out.println("MyConnection closed successful!");
    }

    public static void printMyConnectionState(){
        System.out.print("MyConnection2: {USER_NAME=" + MyConnection2.USER_NAME + " PASSWORD=" + MyConnection2.PASSWORD + " URL=" + MyConnection2.URL);
    }
}//class ends
