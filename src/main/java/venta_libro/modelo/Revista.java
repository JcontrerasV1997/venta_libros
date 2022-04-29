package venta_libro.modelo;

public class Revista extends Producto{
	private String fechaPublicacion;
	private String universidad;
	
	
	
	public Revista(String nombreProducto, String autor, String editorial, double precio, int cantidad,int id,
			String fechaPublicacion, String universidad) {
		super(nombreProducto, autor, editorial, precio, cantidad,id);
		this.fechaPublicacion = fechaPublicacion;
		this.universidad = universidad;
	}

	public Revista() {
		super();
		this.fechaPublicacion = "";
		this.universidad = new String();
	}
	
	public Revista(String fechaPublicacion, String universidad) {
		super();
		this.fechaPublicacion = fechaPublicacion;
		this.universidad = universidad;
	}
	
	public Revista(String nombreProducto, double precio, int cantidad, int id) {
		super();
	}


	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
}
