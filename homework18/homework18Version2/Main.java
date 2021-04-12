package homework18Version2;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Создаем базу данных. В ней одну таблицу user. В таблице ID, userName, password.
         * Создаем отдельный класс для коннекшена, сопутствующие методы.
         * Создаем класс с методами для 5-ти операций: создать, прочитать, обновить, удалить, показать всех.
         * Методы должны возвращать boolean или String. Вызов всех операций в main.
         * Базу создаем руками. Заполняем только через приложение.
         * */

        Dao2Impl dao2Impl = new Dao2Impl();
        User2 user2 = new User2("Frank Sinatra", "qwerty");
        try{
            //run
            MyConnection2.run();

            //insert new user to DB
            dao2Impl.create(user2);

            //read user from DB
            dao2Impl.read("Frank Sinatra");

            //update user data
            dao2Impl.update("James Gosling", "JAVAFIRST", "9");

            //delete user from DB
            dao2Impl.delete("Frank Sinatra", "qwerty");

            //take all users from DB
            List<User2> user2s = dao2Impl.readAll();

            for(User2 u : user2s)
                System.out.println(u);


        }catch (SQLException e){
            System.out.println("We have SQL exception in catch block ...");
            e.printStackTrace();
        }finally {
            try {
                MyConnection2.finish();
            } catch (SQLException e) {
                System.out.println("We have SQL exception in finally block ...");
                e.printStackTrace();
            }
        }
    }//main ends
}//class ends
