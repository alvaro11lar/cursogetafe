package continueBreak;

public class Ejercicio1 {
	public static void main(String[] args) {

		while(true) {
			int numAleatorio=(int)(Math.random()*6+1);
			if(numAleatorio>6) {
				System.out.println("todavia");
			}else {
				if(numAleatorio==6) {
					System.out.println("Felicitaciones has sacado el numero 6");
					break;
				}else {
					System.out.println("Sigue siendo menor");
				}
			}
		}

	}

}
