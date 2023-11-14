package mapas.ejercicios.bibliotecaBaseDatos.entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utils.Utilidades;

public class Biblioteca {

	private long id;
	private String nombre;
	private Direccion direccion;
	

	public Biblioteca(long id, String nombre, Direccion direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion=direccion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	Libro existeLibro(String titulo) {
		try {
			Connection connection = UtilsDataBase.getInstance();
			Statement ps = connection.createStatement();
			ResultSet rs = ps.executeQuery("SELECT * FROM TB_BIBLIOTECA WHERE ID=" + id);
			while(rs.next()) {
				if(rs.getString("TITULO").equals(titulo)) {
					Libro libro = new Libro(rs.getString("TITULO"),rs.getString("AUTOR"),rs.getInt("EjEMPLARES"));
					return libro;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	void leerCatalogo() {
		try {
			Connection connection = UtilsDataBase.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TB_LIBRO WHERE FK_BIBLIOTECA=" + id);
			System.out.println("TITULO     AUTOR     EJEMPLARES");
			while(rs.next()) {
				System.out.println(rs.getString("TITULO") + "     " + rs.getString("AUTOR") + "      " + rs.getInt("EJEMPLARES"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	void aniadirLibro(Libro libro) {
		if(existeLibro(libro.getTitulo())!=null) {
			try {
				Connection connection = UtilsDataBase.getInstance();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT TITULO, EJEMPLARES FROM TB_LIBRO WHERE ID=" + id);
				while(rs.next()) {
					if(rs.getString("TITULO").equals(libro.getTitulo())){
						PreparedStatement ps = connection.prepareStatement("UPDATE TB_LIBRO SET EJEMPLARES=? WHERE TITULO=?");
						ps.setInt(1, (rs.getInt("EJMEPLARES")+libro.getEjemplares()));
						ps.setString(2, libro.getTitulo());
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				Connection connection = UtilsDataBase.getInstance();
				PreparedStatement ps = connection.prepareStatement("INSERT INTO TB_LIBRO(TITULO,AUTOR,EJEMPLARES,FK_BIBLIOTECA)VALUES(?,?,?,?)");
				ps.setString(1, libro.getTitulo());
				ps.setString(2, libro.getAutor());
				ps.setInt(3, libro.getEjemplares());
				ps.setLong(4,id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void aniadirLibro (String titulo, String autor, int cantidad) {
		Libro libro = new Libro(titulo, autor, cantidad);
		aniadirLibro(libro);			
	}

	public void aniadirLibro (String titulo, String autor) {
		aniadirLibro(titulo,autor,1);
	}

	void modificarLibro(String titulo) {
		if(existeLibro(titulo)!=null) {
			try {
				Connection connection = UtilsDataBase.getInstance();
				PreparedStatement ps = connection.prepareStatement("UPDATE TB_LIBRO SET TITULO=?,AUTOR=?,EJEMPLARES=? WHERE TITULO=?");
				int ejemplaresActualizado = Utilidades.pideDatoNumerico("Ingrese el numero de ejemplares: ");
				String autorActualizado = Utilidades.pideDatoTexto("Ingrese el nombre del autor: ");
				String tituloActualizado = Utilidades.pideDatoTexto("Ingrese el nombre del titulo: ");
				ps.setString(1, tituloActualizado);
				ps.setString(2, autorActualizado);
				ps.setInt(3, ejemplaresActualizado);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	void borrarLibro(String titulo) {
			if(existeLibro(titulo)!=null) {
				try {
					Connection connection = UtilsDataBase.getInstance();
					PreparedStatement ps = connection.prepareStatement("DELETE FROM TB_LIBRO WHERE titulo=?");
					ps.setString(1, titulo);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
	void mostrarInfo() {
		try {
			Connection connection =  UtilsDataBase.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT TB.ID, TB.NOMBRE,TD.CALLE,TD.POBLACION \r\n"
					+ "FROM TB_BIBLIOTECA AS TB\r\n"
					+ "INNER JOIN TB_DIRECCION AS TD\r\n"
					+ "ON TB.FK_DIRECCION=TD.ID;");
			while(rs.next()) {	
				if((int)this.id==rs.getInt("TB.ID")) {
					System.out.println(rs.getString("TB.NOMBRE") + rs.getString("TD.CALLE") + rs.getString("TD.POBLCION"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block00
			e.printStackTrace();
		}
	}
	
	void buscarLibroTitulo(String titulo) {
		if(existeLibro(titulo)!=null) {
			Libro libro = existeLibro(titulo);
			System.out.println(libro.getTitulo() + "     " + libro.getAutor() + "     " + libro.getEjemplares());
		}
	}
//	
//	void buscarLibroAutor(String Autor) {
//		if(existeLibro(titulo)!=null) {
//			Libro libro = existeLibro(titulo);
//			System.out.println(libro.getTitulo() + "     " + libro.getAutor() + "     " + libro.getEjemplares());
//		}
//	}
//	
//	

}
