package continueBreak;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int contador=0;
		while(true) {
			int numAleatorio=(int)(Math.random()*6+1);
			//int contador=0;
			if(numAleatorio>6) {
				System.out.println("todavia");
			}else {
				if(numAleatorio==6) {
					System.out.println("Felicitaciones has sacado el numero 6");
					contador++;
					if(contador==3) {
						System.out.println("Felicitaciones has sacado el numero 6 tres veces seguidasS");
						break;
					}
				}else {
					System.out.println("Sigue siendo menor");
					contador=0;
				}
			}
		}
	}
}
