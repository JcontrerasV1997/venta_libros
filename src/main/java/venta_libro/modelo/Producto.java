package venta_libro.modelo;

public class Producto {

	private String nombreProducto;
	private String autor;
	private String editorial;
	private double precio;
	private int cantidad;
	private int id;

	public Producto(String nombreProducto, String autor, String editorial, double precio, int cantidad, int id) {
		super();
		this.nombreProducto = nombreProducto;
		this.autor = autor;
		this.editorial = editorial;
		this.precio = precio;
		this.cantidad = cantidad;
		this.id = id;
	}

	public Producto() {

	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean registrarProducto(String nombreProducto, String autor, String editorial, double precio,
			int cantidad, int id) {

		this.nombreProducto = nombreProducto;
		this.autor = autor;
		this.editorial = editorial;
		this.precio = precio;
		this.cantidad = cantidad;
		this.id=id;

		return true;
	}

	public boolean actualizarPrecio(double newPrecio) {

		this.precio = newPrecio;
		
		return true;
	}

	public String buscarProducto(String newProducto) {

		if (newProducto.equals(this.nombreProducto)) {
			return this.nombreProducto;
		} else {
			return null;
		}
	}
}
