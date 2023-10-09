package poo.ejercicios.composicion.supermercado; 

import utils.Utilidades;

public class Supermercado {

	private String nombre;
	private Cajera[] cajeras;
	private Producto[] stock;
	private Cliente[][] filas;

	public Supermercado(String nombre, Cajera[] cajeras,Producto[] stock) {
		super();
		this.nombre = nombre;
		this.cajeras = cajeras;
		this.stock=stock;
		this.filas=new Cliente[this.cajeras.length][5];
	}
	
	public Supermercado() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cajera[] getCajeras() {
		return cajeras;
	}

	public void setCajeras(Cajera[] cajeras) {
		this.cajeras = cajeras;
	}

	public Producto[] getStock() {
		return stock;
	}

	public void setStock(Producto[] stock) {
		this.stock = stock;
	}

	public Cliente[][] getFilas() {
		return filas;
	}

	public void setFilas(Cliente[][] filas) {
		this.filas = filas;
	}
	
	public static void main(String[]args) {
		Supermercado supermercado=new Supermercado();
		supermercado.abrirSupermercado(supermercado);

	}

	public  void abrirSupermercado(Supermercado supermercado) {

		Producto producto1=new Producto(1,"harina",2,"alimentos");
		Producto producto2=new Producto(2,"sal",1,"alimentos");
		Producto producto3=new Producto(3,"shampoo",5,"higiene");
		Producto producto4=new Producto(4,"pasta dental",1.50,"higiene");
		Producto producto5=new Producto(5,"cuchillo",2,"utensilios");
		Producto[] productos= {producto1,producto2,producto3,producto4,producto5};
		this.setStock(productos);

		Cliente cliente1=new Cliente(1,"Alvaro",true,20);
		Cliente cliente2=new Cliente(2,"Jose",false,100);
		Cliente cliente3=new Cliente(3,"Carlos",true,00);
		Cliente[] cliente= {cliente1,cliente2,cliente3};

		Cajera cajera1=new Cajera(1,"Sofia",1);
		Cajera cajera2=new Cajera(2,"Carla",2);
		Cajera[] cajeras= {cajera1,cajera2};
		this.setCajeras(cajeras);
		Cliente[][] arrayCliente=new Cliente [this.getCajeras().length][5];
		this.setFilas(arrayCliente);

		supermercado.mostrar();

		for(Cliente clientes:cliente) {
			clientes.añadirProductos(supermercado);
		}

		System.out.println("===========================================================");

		supermercado.mostrarCajeras();

		supermercado.seleccionaFila(cliente);
		
		System.out.println("===========================================================");
		
		for(Cajera cajera:this.cajeras) {
			cajera.cobrar(this.filas);
		}
		
		
		
	}

	public Producto encontrarProducto(String nombre) {
		Producto productoEncontrado=null;
		for(int i=0;i<this.stock.length;i++) {
			if(this.stock[i].getNombre().equalsIgnoreCase(nombre)) {
				productoEncontrado=this.stock[i];
			}
		}
		return productoEncontrado; 
	}

	public void mostrar() {
		for(Producto producto:this.stock) {
			System.out.println("id: " + producto.getId() + "    nombre: " + producto.getNombre() + "   	precio: " + 
					producto.getPrecio() + "    tiipo: " + producto.getTipo());
		}
	}

	public void mostrarCajeras() {
		for(Cajera cajeras:this.cajeras) {
			System.out.println("id: " + cajeras.getId() + "    nombre: " + cajeras.getNommbre() + "   	rapidez: " + 
					cajeras.getRapidez()+ " estrellas");
		}
	}

	public Cliente[][] seleccionaFila(Cliente[] clientes) {
		for(int i=0;i<clientes.length;i++) {
			int numFila=Utilidades.pideDatoNumerico("En que fila quieres ir")-1;	
			String msg="";
			for (int j = 0; j < this.filas[numFila].length; j++) {
				if(filas[numFila][j]==null) {
					this.filas[numFila][j]=clientes[i];
					msg="Cliente ingresado";
					break;
				}
			}
			if(msg.isBlank()) {
				System.out.println("La fila esta llena");
			}
		}
		return this.filas;
	} 

	



}
