package colecciones.ejercicios.guerra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import ddbb.ejercicio.Facility;

public class UtilidadesBaseDatos {


	public static ResultSet conecta(String nombreTabla) {
		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";

		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;

		Set<Facility> miTabla= new HashSet<Facility>();
		try {
			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
			stmt = connection.createStatement();

			rs = stmt.executeQuery("SELECT * FROM "+ nombreTabla );

		} catch (SQLException e) {
			System.err.println("Ha habido un error "+e.getMessage());
			//			e.printStackTrace();
		}
		/*finally {
			//System.out.println(miTabla.size());
			try {
				connection.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/

		return rs;

	}	

	public static Connection conectar() {

		String url = "jdbc:mysql://localhost:3306/curso?serverTimezone=Europe/Madrid";
		String username = "root";
		String password = "password";

		Connection connection = null;

		try {
			System.out.println("Estableciendo conexión");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión establecida");
		} catch (SQLException e) {
			System.err.println("Ha habido un error "+e.getMessage());
		}

		return connection;
	}
	
	public static void desconectar(Connection connection) {
		
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
