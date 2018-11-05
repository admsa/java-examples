import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {

			// Establish connection
			Connection conn = DriverManager.getConnection(url, "root", "7XnrdYqvFT");

			// Create statement
			Statement statement = conn.createStatement();

			// Execute statement
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

			// System.out.println(resultSet);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("salar"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
