package poo.ejercicios.composicion.supermercado;

import utils.Utilidades;

public class Cliente {

	private long id;
	private String nombre;
	private Producto[] productos;
	private boolean vip;
	private double saldo;

	public Cliente(long id, String nombre, boolean vip, double saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vip = vip;
		this.saldo=saldo;
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

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void añadirProductos(Supermercado supermercado) {
		Producto[] carritoPequeño=new Producto[5];	
		Producto[] carritoGrande=new Producto[10];	
		System.out.println("Ingrese el carrito que quiere usar: \n1. Carrito Pequeño (maximo 6 productos\n2.Carrito Grande (maximo 10 productos))");
		int opcion=Utilidades.pideDatoNumerico("Que carrito va a usar?");
		switch(opcion){
		case 1:
			for(int i=0;i<carritoPequeño.length;i++) {
				if(i==carritoPequeño.length-1) {
					System.out.println("Esta sera el ultimo producto que insertara");
				}
				String producto=Utilidades.pideDatoTexto("Introduce el nombre del producto");
				Producto productoEncontrado=supermercado.encontrarProducto(producto);
				if(productoEncontrado!=null) {
					carritoPequeño[i]=productoEncontrado;
				}else {
					System.out.println("No existe producto en el supermercado " + supermercado.getNombre());
				}
				this.productos= carritoPequeño;
			}break;
		case 2:
			for(int i=0;i<carritoGrande.length;i++) {
				if(i==carritoGrande.length-1) {
					System.out.println("Esta sera el ultimo producto que insertara");
				}
				String producto=Utilidades.pideDatoTexto("Introduce el nombre del producto");
				Producto productoEncontrado=supermercado.encontrarProducto(producto);
				if(productoEncontrado!=null) {
					carritoGrande[i]=productoEncontrado;
				}else {
					System.out.println("No existe producto en el supermercado " + supermercado.getNombre());
				}
			}
			this.productos= carritoGrande;
			break;
			
		}
		
	}
	
	public void escogeFilaDePago(){
		
	}




	public void pagar(double importe) {
		System.out.println("El cliente " + this.nombre + " esta pagando");
		if(this.saldo>=importe){
			this.saldo=this.saldo-importe;
			System.out.println("Pago exitoso");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}


}
