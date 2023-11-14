package ddbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ddbb.ejercicio.Facility;

public class ConexionBaseDeDatos {
	private static final Logger logger = LogManager.getLogger(ConexionBaseDeDatos.class);  
	
	
	public static void main(String[] args) {
		logger.info("Emepzando biblioteca");
		ConexionBaseDeDatos conexion = new ConexionBaseDeDatos();
		conexion.conecta();
		
	}
	
	private void conecta() {
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
			
			rs = stmt.executeQuery("SELECT * FROM TB_FACILITIES");
			while (rs.next()) {
				Facility f= new Facility(rs.getInt("id"),rs.getDouble("guid"),rs.getString("description"),rs.getString("category"),rs.getString("address"),rs.getDouble("heigth"));
				miTabla.add(f);
				/*System.out.println(rs.getLong("id"));
				System.out.println(rs.getInt("guid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("description"));
				System.out.println(rs.getString("category"));
				System.out.println(rs.getString("address"));
				System.out.println(rs.getDouble("heigth"));
				System.out.println("===============================");*/
				
            }		
			
		} catch (SQLException e) {
			System.err.println("Ha habido un error "+e.getMessage());
//			e.printStackTrace();
		}finally {
			System.out.println(miTabla.size());
			try {
				connection.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
