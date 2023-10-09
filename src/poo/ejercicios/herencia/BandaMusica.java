
package poo.ejercicios.herencia;

public class BandaMusica {
	public static void main(String[] args) {
		BandaMusica bandaMusica=new BandaMusica();
		bandaMusica.empezarConcierto();
	}

	public void empezarConcierto() {
		//Instrumento instrumento1=new Instrumento("Instrumento 1","piano");
		Guitarra guitarra1=new Guitarra("Guitarra 1 ", "guitarra normal", 6);
		GuitarraElectrica guitarraElectrica1=new GuitarraElectrica("Guitarra 2","guitarra electrica",6,455);
		Tambor tambor1=new Tambor("Tambor 1","tambor de forma de barril","madera");
		Piano piano1=new Piano("Piano 1","cuerda percutida",7,"piano de cola");

		Instrumento[] instrumentos= {guitarra1,guitarraElectrica1,tambor1,piano1};
		afinarInstrumentos(instrumentos);
		tocarInstrummentos(instrumentos);

	}

	public void afinarInstrumentos(Instrumento[] intrumentos) {

		for(Instrumento instrumento:intrumentos) {
			instrumento.afinar();
		}
	}


	public void tocarInstrummentos(Instrumento[] intrumentos) {

		for(Instrumento instrumento:intrumentos) {
			if(!(instrumento instanceof Tambor) ) {
				instrumento.tocar();
			}else {
				/*Piano o=(Piano)instrumento;
				o.aporrear();;+ç*/
				((Tambor)instrumento).aporrear();
			}

		}

	}

}
