package venta_libro.logica;

import venta_libro.modelo.Articulo;
import venta_libro.modelo.Libro;
import venta_libro.modelo.Revista;

public class GestionLibros {

	public GestionLibros() {

	}

	public Libro crearLibro(String nombreProducto, String autor, String editorial, double precio, int cantidad, int id,
			int numeroPaginas, String isbn) {
		Libro libro = new Libro(nombreProducto, autor, editorial, precio, cantidad, id, numeroPaginas, isbn);
		return libro;
	}

	public Libro obtenerLibroNombre(String nombre) {
		return new Libro();
	}

	public Articulo crearArticulo(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, int numeroRevisiones, int numeroCitaciones) {
		Articulo articulo = new Articulo(nombreProducto, autor, editorial, precio, cantidad, id, numeroRevisiones,
				numeroCitaciones);
		return articulo;
	}

	public Articulo obtenerArticuloNombre(String nombre) {
		return new Articulo();
	}

	public Revista crearRevista(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, String fechaPublicacion, String universidad) {
		Revista revista = new Revista(nombreProducto, autor, editorial, precio, cantidad, id, fechaPublicacion,
				universidad);
		return revista;
	}

	public Revista obtenerRevista(String nombre) {
		return new Revista();
	}
}
