package mapas.ejercicios.bibliotecaBaseDatos.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mapas.ejercicios.bibliotecaBaseDatos.entities.Biblioteca;
import mapas.ejercicios.bibliotecaBaseDatos.entities.Libro;
import mapas.ejercicios.bibliotecaBaseDatos.entities.UtilsDataBase;
import utils.Utilidades;

public class LibroDAO extends ConexionDAO{

	public LibroDAO() throws SQLException {
		super();
	}

	Libro existeLibro(String titulo, Biblioteca biblioteca) {
		try {
			Statement ps = this.getConexion().createStatement();
			ResultSet rs = ps.executeQuery("SELECT * FROM TB_LIBRO WHERE ID=" + biblioteca.getId());
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

	public void leerCatalogo(Biblioteca biblioteca) {
		try {
			Statement stmt = this.getConexion().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM TB_LIBRO WHERE FK_BIBLIOTECA=" + biblioteca.getId());
			System.out.println("TITULO     AUTOR     EJEMPLARES");
			while(rs.next()) {
				System.out.println(rs.getString("TITULO") + "     " + rs.getString("AUTOR") + "      " + rs.getInt("EJEMPLARES"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void aniadirLibro(Libro libro, Biblioteca biblioteca) {
		if(existeLibro(libro.getTitulo(),biblioteca)!=null) {
			try {
				Statement stmt = this.getConexion().createStatement();
				ResultSet rs = stmt.executeQuery("SELECT TITULO, EJEMPLARES FROM TB_LIBRO WHERE ID=" + biblioteca.getId());
				while(rs.next()) {
					if(rs.getString("TITULO").equals(libro.getTitulo())){
						PreparedStatement ps = this.getConexion().prepareStatement("UPDATE TB_LIBRO SET EJEMPLARES=? WHERE TITULO=?");
						ps.setInt(1, (rs.getInt("EJMEPLARES")+libro.getEjemplares()));
						ps.setString(2, libro.getTitulo());
					}
				}
				System.out.println("Fue actualizado");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				PreparedStatement ps = this.getConexion().prepareStatement("INSERT INTO TB_LIBRO(TITULO,AUTOR,EJEMPLARES,FK_BIBLIOTECA)VALUES(?,?,?,?)");
				ps.setString(1, libro.getTitulo());
				ps.setString(2, libro.getAutor());
				ps.setInt(3, libro.getEjemplares());
				ps.setLong(4,biblioteca.getId());
				ps.executeUpdate();
				System.out.println("Fue agregado");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void aniadirLibro (Biblioteca biblioteca) {
		String titulo = Utilidades.pideDatoTexto("Ingrese el titulo: ");
		String autor = Utilidades.pideDatoTexto("Ingrese el autor: ");
		int ejemplares = Utilidades.pideDatoNumerico("Ingrese la cantidad de ejemplares ");
		Libro libro  = null;
		if(ejemplares<0) {
			libro = new Libro(titulo, autor, 1);
		}else {
			libro = new Libro(titulo, autor, ejemplares);
		}	
		aniadirLibro(libro,biblioteca);			
	}



	public void modificarLibro(Biblioteca biblioteca) {
		String titulo = Utilidades.pideDatoTexto("Introduzca el titulo del libro: ");
		if(existeLibro(titulo,biblioteca)!=null) {
			try {
				int ejemplaresActualizado = Utilidades.pideDatoNumerico("Ingrese el numero de ejemplares: ");
				String autorActualizado = Utilidades.pideDatoTexto("Ingrese el nombre del autor: ");
				String tituloActualizado = Utilidades.pideDatoTexto("Ingrese el nombre del titulo: ");

				if(!tituloActualizado.isEmpty() || !autorActualizado.isEmpty() || ejemplaresActualizado>0 ) {
					String queryUpdate = "UPDATE TB_LIBRO SET";
					List<Object> atributosCambiar = new ArrayList<Object>();
					boolean agregarComa=false;
					if(tituloActualizado!=null && !tituloActualizado.isEmpty()) {
						atributosCambiar.add(tituloActualizado);
						queryUpdate+=" TITULO=? ";
						agregarComa=true;
					}
					if(autorActualizado!=null && !autorActualizado.isEmpty()) {
						atributosCambiar.add(autorActualizado);
						if(agregarComa) {
							queryUpdate+=",";
						}
						queryUpdate+="AUTOR=?";
						agregarComa=true;
					}
					if(ejemplaresActualizado>0) {
						atributosCambiar.add(ejemplaresActualizado);
						if(agregarComa) {
							queryUpdate+=",";
						}
						queryUpdate+=" EJEMPLARES=?";
					}
					PreparedStatement ps = this.getConexion().prepareStatement( queryUpdate + "WHERE TITULO=?");
					for(int i=0;i<atributosCambiar.size();i++) {
						if(atributosCambiar.get(i) instanceof Integer) {
							ps.setInt(i+1,(Integer)atributosCambiar.get(i) );
						}
						ps.setString(i+1, atributosCambiar.get(i).toString());
					}
					ps.setString(atributosCambiar.size()+1, titulo);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void borrarLibro( Biblioteca biblioteca) {
		String titulo = Utilidades.pideDatoTexto("Introduzca el titulo del libro: ");
		if(existeLibro(titulo,biblioteca)!=null) {
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

	public void mostrarInfo(Biblioteca biblioteca) {
		try {
			Connection connection =  UtilsDataBase.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT TB.ID, TB.NOMBRE,TD.CALLE,TD.POBLACION \r\n"
					+ "FROM TB_BIBLIOTECA AS TB\r\n"
					+ "INNER JOIN TB_DIRECCION AS TD\r\n"
					+ "ON TB.FK_DIRECCION=TD.ID;");
			while(rs.next()) {	
				if((int)biblioteca.getId()==rs.getInt("TB.ID")) {
					System.out.println(rs.getString("TB.NOMBRE") + rs.getString("TD.CALLE") + rs.getString("TD.POBLACION"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block00
			e.printStackTrace();
		}
	}

	public void buscarLibroTitulo( Biblioteca biblitioca) {
		String titulo=Utilidades.pideDatoTexto("ingrese el titulo por el que desea bucar:");
		if(existeLibro(titulo, biblitioca)!=null) {
			Libro libro = existeLibro(titulo, biblitioca);
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
