package venta_libro.Servicios;

import java.util.List;

import venta_libro.logica.GestionLibros;
import venta_libro.logica.Inventario;
import venta_libro.modelo.Articulo;
import venta_libro.modelo.Libro;
import venta_libro.modelo.Revista;

public class VentaImplementar implements IVentaLibros {
	private GestionLibros gestionProducto;
	private Inventario inventario;

	public VentaImplementar() {

	}

	@Override
	public void adicionarLibro(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, int numeroPaginas, String isbn) {
		Libro libro = gestionProducto.crearLibro(nombreProducto, autor, editorial, precio, cantidad, id, numeroPaginas,
				isbn);
		inventario.aumentarLibro(libro);
	}

	@Override
	public void adicionarArticulo(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, int numeroRevisiones, int numeroCitaciones) {
		Articulo articulo = gestionProducto.crearArticulo(nombreProducto, autor, editorial, precio, cantidad, id,
				numeroRevisiones, numeroCitaciones);
		inventario.aumentarArticulo(articulo);
	}

	@Override
	public void adicionarRevista(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, String fechaPublicacion, String universidad) {

		Revista revista = gestionProducto.crearRevista(nombreProducto, autor, editorial, precio, cantidad, id,
				fechaPublicacion, universidad);
		inventario.aumentarRevista(revista);
	}

	@Override
	public Libro consultarLibro(String nombrelibro) {
		if (this.inventario.isLibroDisponible(nombrelibro)) {
			Libro libro = this.gestionProducto.obtenerLibroNombre(nombrelibro);
			return libro;
		}
		return null;
	}

	@Override
	public Articulo consultarArticulo(String nombreArticulo) {
		if (this.inventario.isArticuloDisponible(nombreArticulo)) {
			Articulo articulo = this.gestionProducto.obtenerArticuloNombre(nombreArticulo);
			return articulo;
		}
		return null;

	}

	@Override
	public Revista consultarRevista(String nombreRevista) {

		if (this.inventario.isRevistaDisponible(nombreRevista)) {
			Revista revista = this.gestionProducto.obtenerRevista(nombreRevista);
			return revista;
		}
		return null;

	}

}
