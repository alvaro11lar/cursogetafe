package poo.ejercicios.composicion.supermercado;

public class Cajera {

	private long id;
	private String nommbre;
	private int rapidez;

	public Cajera(long id, String nommbre, int rapidez) {
		super();
		this.id = id;
		this.nommbre = nommbre;
		this.rapidez=rapidez;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNommbre() {
		return nommbre;
	}

	public void setNommbre(String nommbre) {
		this.nommbre = nommbre;
	}

	public int getRapidez() {
		return rapidez;
	}

	public void setRapidez(int rapidez) {
		this.rapidez = rapidez;
	}	

	public double cobrar(Cliente[][] filas){
		Cliente[] fila=filas[(int)this.id-1];
		double importe=0;
		for(Cliente cliente:fila) {
			if(cliente!=null) {
				System.out.println("La cajera " + this.nommbre + "Empezamos a cobrar al cliente " + cliente.getNombre());
				importe=0;
				double descuento=0;

				for(Producto producto:cliente.getProductos()) {
					if(producto!=null) {
						if(!cliente.isVip()) {
							descuento=0.1;
							double precioConDescuento=producto.getPrecio()-producto.getPrecio()*descuento;
							importe+=precioConDescuento;
						}else {
							importe+=producto.getPrecio();
						}
					}
				}
				System.out.println("El total del importe es de: " + importe + " euros");
				cliente.pagar(importe);
			}
		}

		return importe;	
	}


}
