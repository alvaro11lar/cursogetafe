package continueBreak;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int dineroApostar=0;
		int opcion = 0;
		int jugadorPrimero=0;
		int jugadorSegundo=0;
		int jugadorTercero=0;

		System.out.println("Cuantos jugadores participaran en el juego: ");
		Scanner scanJugadores = new Scanner(System.in);
		int numJugadores = scanJugadores.nextInt();
		for(int i=1;i<=numJugadores;i++){
			System.out.println("Cuanto dinero tiene el " + i + "  jugador");
			if(i==1) {
				Scanner scanDinero1 = new Scanner(System.in);
				jugadorPrimero = scanDinero1.nextInt();
			}else if(i==2) {
				Scanner scanDinero2 = new Scanner(System.in);
				jugadorSegundo = scanDinero2.nextInt();
			}else if(i==3) {
				Scanner scanDinero3 = new Scanner(System.in);
				jugadorTercero = scanDinero3.nextInt();
			}
		}
		System.out.println("El jugador 1 tiene: " + jugadorPrimero);
		System.out.println("El jugador 2 tiene: " + jugadorSegundo);
		System.out.println("El jugador 3 tiene: " + jugadorTercero);

		int actualJugador=1;

		for(int i=1;i<=numJugadores;i++) {
			
			while(actualJugador<=numJugadores) {
				//				if(dineroApostar>jugadorPrimero) {
				//					System.out.println("El dinero es mayor al de la cuenta");
				//				}else {
				
				System.out.println("bienvenido jugador " + i);
				System.out.println("1. Apostar por un numero (0-36) \n2. Apostar por docenas (0-12/13-24/25-36)"
						+ " \n3. Apostar por par/impar \n4. Apostar por rojo/negro \n5. Dejar de jugar ");
				Scanner scan1 = new Scanner(System.in);
				opcion = scan1.nextInt();
				
			
				switch(opcion) {
				case 1: 
					int numero = (int)(Math.random()*36+1);
					System.out.println("Indica porque numero quiere apostar: ");
					Scanner scan2 = new Scanner(System.in);
					int numeroApostado1 = scan2.nextInt();

					System.out.println("Ingrese el dinero que quieres apostar: ");
					Scanner scan = new Scanner(System.in);
					dineroApostar = scan.nextInt();

					if(actualJugador==1) {
						jugadorPrimero = jugadorPrimero - dineroApostar;
						if(numeroApostado1==numero) {
							jugadorPrimero = dineroApostar * 36;
						}else {
							System.out.println("No has acertado!!!");
						}
					}else if(actualJugador==2) {
						jugadorSegundo = jugadorSegundo - dineroApostar;
						if(numeroApostado1==numero) {
							jugadorSegundo = dineroApostar * 36;
						}else {
							System.out.println("No has acertado!!!");
						}
					}else if(actualJugador==3) {
						jugadorTercero = jugadorTercero - dineroApostar;
						if(numeroApostado1==numero) {
							jugadorTercero = dineroApostar * 36;
						}else {
							System.out.println("No has acertado!!!");
						}
					}
					break;
				case 2: 
					int numero1 = (int)(Math.random()*36+1);
					System.out.println("Indica porque docena quieres apostar: ");
					System.out.println("1. (0-12) \n2. (13-24) \3. (25-36) ");
					Scanner scan3 = new Scanner(System.in);
					int numeroDocena = scan3.nextInt();

					System.out.println("Ingrese el dinero que quieres apostar: ");
					Scanner scan4 = new Scanner(System.in);
					dineroApostar = scan4.nextInt();

					int docena=0;
					if(numero1>=1 && numero1<=12) {
						docena=1;	
					}else if(numero1>=13 && numero1<=24) {
						docena=2;
					}else if(numero1>=25 && numero1<=36) {
						docena=3;
					}

					if(numeroDocena==docena) {
						if(actualJugador==1) {
							jugadorPrimero = jugadorPrimero - dineroApostar;
							jugadorPrimero = dineroApostar *12;
						}else if(actualJugador==2) {
							jugadorSegundo = jugadorSegundo - dineroApostar;
							jugadorSegundo = dineroApostar *12;
						}else if(actualJugador==3) {
							jugadorTercero = jugadorTercero - dineroApostar;
							jugadorTercero = dineroApostar *12;
						}
						System.out.println("Felicidades has acertad");
					}else {
						if(actualJugador==1) {
							jugadorPrimero = jugadorPrimero - dineroApostar;
							System.out.println("No has acertado");
						}else if(actualJugador==2) {
							jugadorSegundo = jugadorSegundo - dineroApostar;
							System.out.println("No has acertado");
						}else if(actualJugador==3) {
							jugadorTercero = jugadorTercero - dineroApostar;
							System.out.println("No has acertado");
						}
					}
					break;
				case 3: 
					int numero2 = (int)(Math.random()*36+1);
					System.out.println("Indica si es par o impar: ");
					Scanner scan5 = new Scanner(System.in);
					String valorApostado = scan5.nextLine();

					System.out.println("Ingrese el dinero que quieres apostar: ");
					Scanner scan6 = new Scanner(System.in);
					dineroApostar = scan6.nextInt();
					if(numero2%2==0) {
						String valor = "par";
						if(valor.equalsIgnoreCase(valorApostado)) {
							if(actualJugador==1) {
								jugadorPrimero = jugadorPrimero - dineroApostar;
								jugadorPrimero = jugadorPrimero + (dineroApostar * 2);
								System.out.println("Felicitaciones has acertado acertado!!!");
							}else if(actualJugador==2) {
								jugadorSegundo = jugadorSegundo - dineroApostar;
								jugadorSegundo = jugadorPrimero + (dineroApostar * 2);
								System.out.println("Felicitaciones has acertado acertado!!!");
							}else if(actualJugador==3) {
								jugadorTercero = jugadorTercero - dineroApostar;
								jugadorTercero = jugadorPrimero + (dineroApostar * 2);
								System.out.println("Felicitaciones has acertado acertado!!!");
							}
						}else{
							if(actualJugador==1) {
								jugadorPrimero = jugadorPrimero - dineroApostar;
								System.out.println("No has acertado");
							}else if(actualJugador==2) {
								jugadorSegundo = jugadorSegundo - dineroApostar;
								System.out.println("No has acertado");
							}else if(actualJugador==3) {
								jugadorTercero = jugadorTercero - dineroApostar;
								System.out.println("No has acertado");
							}
						}
					}else{
						String valor = "impar";
						if(valor.equalsIgnoreCase(valorApostado)) {
							if(actualJugador==1) {
								jugadorPrimero = jugadorPrimero - dineroApostar;
								jugadorPrimero = dineroApostar * 2;
								System.out.println("Felicitaciones has acertado acertado!!!");
							}else if(actualJugador==2) {
								jugadorSegundo = jugadorSegundo - dineroApostar;
								jugadorSegundo = dineroApostar * 2;
								System.out.println("Felicitaciones has acertado acertado!!!");
							}else if(actualJugador==3) {
								jugadorTercero = jugadorTercero - dineroApostar;
								jugadorTercero = dineroApostar * 2;
								System.out.println("Felicitaciones has acertado acertado!!!");
							}
						}else {
							if(actualJugador==1) {
								jugadorPrimero = jugadorPrimero - dineroApostar;
								System.out.println("No has acertado");
							}else if(actualJugador==2) {
								jugadorSegundo = jugadorSegundo - dineroApostar;
								System.out.println("No has acertado");
							}else if(actualJugador==3) {
								jugadorTercero = jugadorTercero - dineroApostar;
								System.out.println("No has acertado");
							}
						}
					}
					break;
				case 4: 
					int numero3 = (int)(Math.random()*36+1);
					System.out.println("Indica si es rojo o negro: ");
					Scanner scan7 = new Scanner(System.in);
					String colorApostado = scan7.nextLine();

					System.out.println("Ingrese el dinero que quieres apostar: ");
					Scanner scan8 = new Scanner(System.in);
					dineroApostar = scan8.nextInt();

					String color="";
					if(numero3>=1 && numero3<=18) {
						color="negro";	
					}else if(numero3>=19 && numero3<=36) {
						color="rojo";
					}

					if(numero3==0) {
						if(actualJugador==1) {
							jugadorPrimero = jugadorPrimero - dineroApostar;
							System.out.println("Mala suerte ha salido el numero cero");
						}else if(actualJugador==2) {
							System.out.println("Mala suerte ha salido el numero cero");
						}else if(actualJugador==3) {
							jugadorTercero = jugadorTercero - dineroApostar;
							System.out.println("Mala suerte ha salido el numero cero");
						}
						System.out.println("Mala suerte ha salido el numero cero");
					}else if(color.equalsIgnoreCase(colorApostado)){
						if(actualJugador==1) {
							jugadorPrimero = jugadorPrimero - dineroApostar;
							jugadorPrimero = dineroApostar * 2;
							System.out.println("Felicitaciones has acertado acertado!!!");
						}else if(actualJugador==2) {
							jugadorSegundo = jugadorSegundo - dineroApostar;
							jugadorSegundo = dineroApostar * 2;
							System.out.println("Felicitaciones has acertado acertado!!!");
						}else if(actualJugador==3) {
							jugadorTercero = jugadorTercero - dineroApostar;
							jugadorTercero = dineroApostar * 2;
							System.out.println("Felicitaciones has acertado acertado!!!");
						}
					}else if(!color.equalsIgnoreCase(colorApostado)) {
						if(actualJugador==1) {
							jugadorPrimero = jugadorPrimero - dineroApostar;
							System.out.println("No has acertado");
						}else if(actualJugador==2) {
							jugadorSegundo = jugadorSegundo - dineroApostar;
							System.out.println("No has acertado");
						}else if(actualJugador==3) {
							jugadorTercero = jugadorTercero - dineroApostar;
							System.out.println("No has acertado");
						}
					}
					break;
					
					
//				case 5: 
//					if(actualJugador==1) {
//						System.out.println("El dinero actual del jugador " + i + " es: " + jugadorPrimero);
//					}else if(actualJugador==2) {
//						System.out.println("El dinero actual del jugador " + i + " es: " + jugadorSegundo);
//					}else if(actualJugador==3){
//						System.out.println("El dinero actual del jugador " + i + " es: " + jugadorTercero);
//					}
//					actualJugador++;
//					break;

				}
				if(opcion==5) {
					if(actualJugador==1) {
						System.out.println("Su dinero actual de jugador " + i + " es de " + jugadorPrimero);
					}else if(actualJugador==2) {
						System.out.println("Su dinero actual de jugador " + i + " es de " + jugadorSegundo);
					}else if(actualJugador==3) {
						System.out.println("Su dinero actual de jugador " + i + " es de " + jugadorTercero);
					}
					actualJugador++;
					break;
					
				}

			}

		}
	}



}

//		int jugadorDinero =0;
//		while(jugadorDinero>0 && opcion!=5) {
//			if(dineroApostar>jugadorDinero) {
//				System.out.println("El dinero es mayor al de la cuenta");
//			}else {
//				System.out.println("1. Apostar por un numero (0-36) \n2. Apostar por docenas (0-12/13-24/25-36)"
//						+ " \n3. Apostar por par/impar \n4. Apostar por rojo/negro \n5. Dejar de jugar ");
//				Scanner scan1 = new Scanner(System.in);
//				opcion = scan1.nextInt();
//				switch(opcion) {
//				case 1: 
//					int numero = (int)(Math.random()*36+1);
//					System.out.println("Indica porque numero quiere apostar: ");
//					Scanner scan2 = new Scanner(System.in);
//					int numeroApostado1 = scan2.nextInt();
//
//					System.out.println("Ingrese el dinero que quieres apostar: ");
//					Scanner scan = new Scanner(System.in);
//					dineroApostar = scan.nextInt();
//
//					jugadorDinero = jugadorDinero - dineroApostar;
//					if(numeroApostado1==numero) {
//						jugadorDinero = dineroApostar * 36;
//					}else {
//						System.out.println("No has acertado!!!");
//					}
//					break;
//				case 2: 
//					int numero1 = (int)(Math.random()*36+1);
//					System.out.println("Indica porque docena quieres apostar: ");
//					Scanner scan3 = new Scanner(System.in);
//					int numeroApostado2 = scan3.nextInt();
//
//					System.out.println("Ingrese el dinero que quieres apostar: ");
//					Scanner scan4 = new Scanner(System.in);
//					dineroApostar = scan4.nextInt();
//					jugadorDinero = jugadorDinero - dineroApostar;
//					if(numeroApostado2>=0 && numeroApostado2<=12) {
//						jugadorDinero = dineroApostar *12;
//						System.out.println("Felicitaciones has acertado acertado!!!");
//					}else if(numeroApostado2>=13 && numeroApostado2<=24) {
//						jugadorDinero = dineroApostar *12;
//						System.out.println("Felicitaciones has acertado acertado!!!");
//					}else if(numeroApostado2>=25 && numeroApostado2<=36) {
//						jugadorDinero = dineroApostar *12;
//						System.out.println("Felicitaciones has acertado acertado!!!");
//					}else {
//						System.out.println("No has acertado!!!");
//					}
//					break;
//				case 3: 
//					int numero2 = (int)(Math.random()*36+1);
//					System.out.println("Indica si es par o impar: ");
//					Scanner scan5 = new Scanner(System.in);
//					String valorApostado = scan5.nextLine();
//
//					System.out.println("Ingrese el dinero que quieres apostar: ");
//					Scanner scan6 = new Scanner(System.in);
//					dineroApostar = scan6.nextInt();
//					jugadorDinero = jugadorDinero - dineroApostar;
//					if(numero2%2==0) {
//						String valor = "par";
//						if(valor.equalsIgnoreCase(valorApostado)) {
//							jugadorDinero = dineroApostar * 2;
//							System.out.println("Felicitaciones has acertado acertado!!!");
//						}else{
//							System.out.println("No has acertado acertado!!!");
//						}
//					}else{
//						String valor = "impar";
//						if(valor.equalsIgnoreCase(valorApostado)) {
//							jugadorDinero = dineroApostar * 2;
//							System.out.println("Felicitaciones has acertado acertado!!!");
//						}else {
//							System.out.println("No has acertado acertado!!!");
//						}
//					}
//					break;
//				case 4: 
//					int numero3 = (int)(Math.random()*36+1);
//					System.out.println("Indica si es rojo o negro: ");
//					Scanner scan7 = new Scanner(System.in);
//					String colorApostado = scan7.nextLine();
//
//					System.out.println("Ingrese el dinero que quieres apostar: ");
//					Scanner scan8 = new Scanner(System.in);
//					dineroApostar = scan8.nextInt();
//					jugadorDinero = jugadorDinero - dineroApostar;
//					if(numero3==0) {
//						System.out.println("Mala suerte ha salido el numero cero");
//					}else if(numero3>=1 && numero3<=18){
//						String color = "negro";
//						if(color.equalsIgnoreCase(colorApostado)) {
//							jugadorDinero = jugadorDinero * 2;
//						}else {}
//					}else if(numero3>=19 && numero3<=36) {
//						String color = "rojo";
//						if(color.equalsIgnoreCase(colorApostado)) {
//							jugadorDinero = jugadorDinero * 2;
//						}else {}
//					}
//					break;
//				case 5: 
//					System.out.println("El dinero actual del jugador " + i + " es: " + jugadorDinero);
//					break;
//
//				}
//
//			}
//
//		}



