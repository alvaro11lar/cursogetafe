package colecciones.ejercicios.guerra;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import colecciones.ejercicios.guerra.excepciones.AtaqueInsuficiente;
import colecciones.ejercicios.guerra.excepciones.GuerreroFueraRango;
import colecciones.ejercicios.guerra.excepciones.PoderInsuficiente;

public class Guerra {

	public static void main(String[] args) {
		
		VehiculoGuerra miVe=null;
		try{
		Nave nave2=new Nave("El Beta");	
		Guerrero guerrero1=new Guerrero("Alvaro","militar");
		Guerrero guerrero2 =new Guerrero("Alvaro","militar",3,1);
		Guerrero guerrero3=new Guerrero("Jose","alien",3,2);
		Guerrero guerrero4=new Guerrero("Juan","animal",9,1);
		Guerrero guerrero5=new Guerrero("Carlos","humano",7,1);
		
		nave2.embarcar(guerrero1);
		nave2.embarcar(guerrero2);
		nave2.embarcar(guerrero3);
		nave2.embarcar(guerrero4);
		nave2.embarcar(guerrero5);
		miVe=nave2;
		
		
		}catch(PoderInsuficiente pi) {
			System.out.println(pi.getMessage());
		}catch(GuerreroFueraRango gfr) {
			System.out.println(gfr.getMessage());
		}	
		
		Guerra guerra=new Guerra();
		guerra.empezarGuerra(miVe);

	}
	
	public void empezarGuerra(VehiculoGuerra vg)  {
		VehiculoGuerra miVehiculo=null;

			miVehiculo=crearEquipoBaseDatos();
			
			
		
		/*List <VehiculoGuerra> vehiculos=new ArrayList<VehiculoGuerra>();
		vehiculos.add(miVehiculo);
		vehiculos.add(vg);*/
		
		while(vg.getPuntosVida()>0 && miVehiculo.getPuntosVida()>0) {
			
			int miAtaque=miVehiculo.atacar();
			int suDefensa=vg.defender(miAtaque);
			vg.setPuntosVida(vg.getPuntosVida()-suDefensa);
			System.out.println("=================");
			if(vg.getPuntosVida()<=0) {
				break;
			}
			
			int suAtaque=vg.atacar();
			int miDefensa=	miVehiculo.defender(suAtaque);
			miVehiculo.setPuntosVida(miVehiculo.getPuntosVida()-miDefensa);
			System.out.println("=================");
			if(miVehiculo.getPuntosVida()<=0) {
				break;
			}
		}
		
		if(vg.getPuntosVida()<miVehiculo.getPuntosVida()){
			System.out.println("El ganador de la guerra es: " + miVehiculo.getNombre());
		}else {
			System.out.println("El ganador de la guerra es: " + vg.getNombre());
		}
		
		
		
		
		
	}

	VehiculoGuerra crearEquipo() throws PoderInsuficiente,GuerreroFueraRango {
		Nave nave1=new Nave("El beta");

		Guerrero guerrero1=new Guerrero("Alvaro","militar");
		Guerrero guerrero2 = new Guerrero("Alvaro","militar",2,8);
		Guerrero guerrero3=new Guerrero("Jose","alien",3,2);
		Guerrero guerrero4=new Guerrero("Juan","animal",6,2);
		Guerrero guerrero5=new Guerrero("Carlos","humano",7,1);
		
		nave1.embarcar(guerrero1);
		nave1.embarcar(guerrero2);
		nave1.embarcar(guerrero3);
		nave1.embarcar(guerrero4);
		nave1.embarcar(guerrero5);
		
		
		return nave1;
	}
	
	VehiculoGuerra crearEquipoBaseDatos() {
		
		
		ResultSet miVehiculo=UtilidadesBaseDatos.conecta("TB_VEHIVULOS_GUERRA");
		VehiculoGuerra vehiculo=null;
		try {
			while(miVehiculo.next()) {
				System.out.println("dddddd");
				vehiculo=new Nave(miVehiculo.getString("nombre"),miVehiculo.getInt("ataque"),miVehiculo.getInt("Defensa"));
				System.out.println("jjj");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(AtaqueInsuficiente ai) {
			System.out.println(ai.getMessage());
		}
		
		ResultSet miTabla=UtilidadesBaseDatos.conecta("TB_GUERRERO");
		//List<Guerrero> guerreros=new ArrayList<Guerrero>();
		try {
			while(miTabla.next()) {
				Guerrero miGuerrero=new Guerrero(miTabla.getString("nombre"),miTabla.getString("tipo"),miTabla.getDouble("fuerza"),miTabla.getDouble("resistencia"));
				//guerreros.add(miGuerrero);
				vehiculo.getGuerreros().add(miGuerrero);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(PoderInsuficiente pi){
			pi.getMessage();
		}
		
		return vehiculo;
	}
	
	void VehiculoGuerra (String tipoVehiculo) {
		
		Connection connection=UtilidadesBaseDatos.conectar();
		Statement stmt=null;
		ResultSet rs=null;
		VehiculoGuerra vehiculo=null;
		try {
			stmt=connection.createStatement();
			rs=stmt.executeQuery("SELECT * FROM TB_VEHIVULO_GUERRA");
			while(rs.next()) {
				if(rs.getString("Tipo").equalsIgnoreCase(tipoVehiculo)) {
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
