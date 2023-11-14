package mapas.ejercicios.bibliotecaBaseDatos.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mapas.ejercicios.bibliotecaBaseDatos.entities.Biblioteca;
import mapas.ejercicios.bibliotecaBaseDatos.entities.Direccion;


public class BibliotecaDAO extends ConexionDAO{

	public BibliotecaDAO() throws SQLException {
		super();
	}
	

	public List<Biblioteca> getBibliotecas () throws SQLException {
		
		List<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();

		Statement stmt = this.getConexion().createStatement();
		String query = "SELECT TB.ID, NOMBRE, CALLE, POBLACION \r\n"
				+ "FROM TB_BIBLIOTECA AS TB\r\n"
				+ "JOIN TB_DIRECCION AS TC\r\n"
				+ "ON TB.FK_DIRECCION=TC.ID";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			long idBiblioteca = rs.getLong("TB.ID");
			String nombreBiblioteca = rs.getString("NOMBRE");
			String calleDireccion = rs.getString("CALLE");
			String poblacionDireccion = rs.getString("POBLACION");

			Direccion dire = new Direccion(calleDireccion,poblacionDireccion);
			Biblioteca biblio = new Biblioteca(idBiblioteca, nombreBiblioteca, dire);
			
			bibliotecas.add(biblio);
		}
		
		return bibliotecas;
	}
	
	
	
	

}
