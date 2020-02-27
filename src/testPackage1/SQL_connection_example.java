package testPackage1;

import java.sql.*;

public class SQL_connection_example {
    public static final String DB_Driver = "org.postgresql.Driver";

    public static String DB_URL_K19_test4 = "jdbc:postgresql://HOST:PORT/DBALIAS?user=USERNAME&password=DBPASSWORD";

    public static void main(String[] args) {
        try {
            Class.forName(DB_Driver);
            Connection connection = DriverManager.getConnection(DB_URL_K19_test4);
            System.out.println("Соединение с СУБД выполнено.");

            Statement statement = connection.createStatement();
            int urs = statement.executeUpdate("UPDATE блаблабла");
            System.out.println("urs = " + urs);
            ResultSet rs = statement.executeQuery("SELECT блаблабла");
            System.out.println("rs = " + rs);

            while (rs.next()) {
                int columnNameInt = rs.getInt("columnLabel");
                String columnNameString = rs.getString("columnLabel");

                System.out.println("columnNameInt = " + columnNameInt + ", columnNameString " + columnNameString);
            }

            System.out.println("\nНачинаю отключение от СУБД и освобождение ресурсов...");
            try {
                rs.close();
                statement.close();
                connection.close();
            } finally { //типа перестраховка...
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
            System.out.println("Отключение от СУБД выполенено.");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC Драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL!");
        }
    }
}
