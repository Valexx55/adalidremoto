package adalid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.net.aso.r;

public class BaseDatos {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;

		try {
			// registro el driver
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			// obtengo la conexión
			connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "adalid");
			// creo el statemen
			statement = connection.createStatement();
			// ejecuto la consulta
			resultset = statement.executeQuery("SELECT FIRST_NAME FROM EMPLOYEES");

			while (resultset.next()) {
				String nombre = resultset.getString("FIRST_NAME");
				System.out.println(nombre);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				resultset.close();
				statement.close();
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
