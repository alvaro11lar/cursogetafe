package poo.ejercicios.composicion.carreras;

import java.util.Scanner;

import utils.Utilidades;

public class CasaApuestas {

	public static void main(String[] args) {
		Caballo a=new Caballo(1,"aaa",11,6,40,200);
		Caballo b=new Caballo(2,"bbb",12,7,50,300);
		Caballo c=new Caballo(3,"ccc",13,8,60,350);
		Caballo d=new Caballo(4,"ddd",14,9,45,246);
		Caballo e=new Caballo(5,"eee",15,10,75,305);
		Caballo f=new Caballo(6,"fff",16,11,78,248);

		Caballo[] caballos1= {a,b,c};
		Caballo[] caballos2= {d,e,f};

		Carrera carrera1=new Carrera(1,"getafe",1000,caballos1);
		Carrera carrera2=new Carrera(2,"valdemoro",4000,caballos2);

		Carrera[] carreras= {carrera1,carrera2};

		GranPremio pre=new GranPremio(1,"aranjuez",carreras);
		Apostante apos1=new Apostante("alvaro",1000);
		Apostante apos2=new Apostante("luis",2000);

		Apostante[] apostantes= {apos1, apos2}; 

		System.out.println("Estamos en el Gran Premio "+ pre.getNombre() +" con identificador " + pre.getId() + " ");
		for(int i=0;i<pre.getCarreras().length;i++) {
			System.out.println("Estos son los caballos de la " + "carrera " + (i+1) );
			for(Caballo horse:pre.getCarreras()[i].getCaballos()) {
				System.out.println("Nombre: " + horse.getNombre() + "   Numero: " + horse.getNumero());
			}
		}
		
		
		for(int z=0;z<pre.getCarreras().length;z++) {
			System.out.println("Estamos en la carrera " + (z+1)+ "\nCaracteristicas: id: " + pre.getCarreras()[z].getId() +
					"    nombre: " +pre.getCarreras()[z].getNombre() + "    distancia: " + pre.getCarreras()[z].getDistancia());
			for(int i=0; i<apostantes.length;i++) {
				System.out.println("Bienvenido " + apostantes[i].getNombre());
					int numCaballo=Utilidades.pideDatoNumerico("Ingrese el numero de caballo por el que quiere apostar: ");
					apostantes[i].setApuesta(numCaballo);
					/*if(carre.encontrarCaballo(numCaballo)==1) {
						System.out.println("Seleccion ingresada");
					}*/
					double importe =(double)Utilidades.pideDatoNumerico("Ingrese el importe de la apuesta: ");
					CasaApuestas casa=new CasaApuestas();
					casa.ganarDinero(apostantes[i],pre.getCarreras()[z], importe);
					System.out.println("El apostante " + apostantes[i].getNombre() + " tiene " + apostantes[i].getSaldo());
				}
			}
		}

	public void ganarDinero(Apostante a, Carrera ca, double importe) {
		double total=a.getSaldo()-importe;
		a.setSaldo(total);
		if(a.getApuesta()==ca.iniciarCarrera()) {
			a.setSaldo(importe*5+total);
		}
	}

}
