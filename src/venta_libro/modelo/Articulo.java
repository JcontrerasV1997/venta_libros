package venta_libro.modelo;

public class Articulo extends Producto {

	private int numeroRevisiones;
	private int numeroCitaciones;

	public Articulo(int numeroRevisiones, int numeroCitaciones) {
		super();
		this.numeroRevisiones = numeroRevisiones;
		this.numeroCitaciones = numeroCitaciones;
	}

	public Articulo() {

	}

	public Articulo(String nombreProducto, String autor, String editorial, double precio, int cantidad, int id,
			int numeroRevisiones, int numeroCitaciones) {
		super(nombreProducto, autor, editorial, precio, cantidad,id);
		this.numeroRevisiones = numeroRevisiones;
		this.numeroCitaciones = numeroCitaciones;
	}

	public boolean cambiarPrecio(double newPrecio) {

		double nuevoPrecio = (newPrecio * 0.8);
		super.setPrecio(nuevoPrecio);
		// return super.cambiarPrecio(nuevoPrecio);
		System.out.println("Esta en el metodo cambiar precio");
		return true;
	}

	public int getNumeroRevisiones() {
		return numeroRevisiones;
	}

	public void setNumeroRevisiones(int numeroRevisiones) {
		this.numeroRevisiones = numeroRevisiones;
	}

	public int getNumeroCitaciones() {
		return numeroCitaciones;
	}

	public void setNumeroCitaciones(int numeroCitaciones) {
		this.numeroCitaciones = numeroCitaciones;
	}

}
