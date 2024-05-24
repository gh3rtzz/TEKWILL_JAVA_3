package lecture_nr_24;

import java.sql.*;

//Singleton connection pattern
class ConnectionToDatabase{

    private static Connection instance = null;


    private ConnectionToDatabase(){

    }

    public static Connection getNewConnection(String jdbc) throws SQLException {
        if(instance == null)
            return DriverManager.getConnection(jdbc);
        else return instance;
    }

    public static void closeConnection() throws SQLException {
        instance.close();
        instance = null;
    }
}

public class Main {

    private static final String SELECT_ALL_EMPLOYEE_INFO = "select * from employee_info";
    private static final String INSERT_ALL_INTO_EMPLOYEE_INFO = "insert into employee_info(name, surname, age, ismale, idnp) " +
            "values (?, ?, ?, ?, ?)";

    public static void main(String[] args) throws SQLException {

        String connectionString = "jdbc:postgresql://localhost:5432/employee_db";

        //Create a connection

        Connection conn = ConnectionToDatabase.getNewConnection(connectionString);

        Statement stmt = conn.createStatement();

        ResultSet result1 = stmt.executeQuery("SELECT * FROM employee_info");

//        while(result1.next()){
//            System.out.println("NAME: " + result1.getString("name") + " SURNAME: " + result1.getString("surname"));
//        }

        ResultSetMetaData rsmd = result1.getMetaData();
        System.out.println(rsmd.getColumnName(1));

        String[] columns = new String[rsmd.getColumnCount()];

        for(int index = 0; index != columns.length; index++){
            columns[index] = rsmd.getColumnName(index + 1);
        }

        for (String element :
                columns) {
            System.out.println(element);
        }

        while(result1.next()){

            for (String element :
                    columns) {
                System.out.print(element + "\t:\t" + result1.getString(element) + "\t");
            }
            System.out.println();
        }

        //Insert a new employee into the database

//        stmt.executeUpdate("INSERT INTO employee_info (name, surname, age, ismale, idnp) " +
//                "values ('Jetbrains', 'IntelliJ', 30, true, '1123123123')");


        //Prepared statement

//        PreparedStatement preparedStatement = conn.prepareStatement(INSERT_ALL_INTO_EMPLOYEE_INFO);
//
//        preparedStatement.setString(1, "test name");
//        preparedStatement.setString(2, "test surname");
//        preparedStatement.setInt(3, 40);
//        preparedStatement.setBoolean(4, false);
//        preparedStatement.setInt(5, 123180);
//
////        preparedStatement.executeUpdate();

        insertAllIntoEmployeeInfo(conn, "Test NAme 1", "TEST USERNAME", 70, true, 9912);

        conn.close();


    }

    public static int insertAllIntoEmployeeInfo(Connection conn, String name, String surname, int age, boolean ismale, int idnp) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(INSERT_ALL_INTO_EMPLOYEE_INFO);

        preparedStatement.setString(1, name);
        preparedStatement.setString(2, surname);
        preparedStatement.setInt(3, age);
        preparedStatement.setBoolean(4, ismale);
        preparedStatement.setInt(5, idnp);

        return preparedStatement.executeUpdate();
    }
}
