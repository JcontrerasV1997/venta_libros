package venta_libro.servicios;

import java.util.List;

import venta_libro.logica.GestionProducto;
import venta_libro.logica.Inventario;
import venta_libro.modelo.Articulo;
import venta_libro.modelo.Libro;
import venta_libro.modelo.Revista;

public class VentaImplementar implements IVentaLibros {
	private GestionProducto gestionProducto;
	private Inventario inventario;

	public VentaImplementar() {
		this.gestionProducto = new GestionProducto();
		this.inventario = new Inventario();
		
	}

	public void adicionarLibro(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, int numeroPaginas, String isbn) {
		Libro libro = gestionProducto.crearLibro(nombreProducto, autor, editorial, precio, cantidad, id, numeroPaginas,
				isbn);
		inventario.aumentarLibro(libro);

	}

	public void adicionarArticulo(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, int numeroRevisiones, int numeroCitaciones) {
		Articulo articulo = gestionProducto.crearArticulo(nombreProducto, autor, editorial, precio, cantidad, id,
				numeroRevisiones, numeroCitaciones);
		inventario.aumentarArticulo(articulo);

	}

	public void adicionarRevista(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, String fechaPublicacion, String universidad) {
		Revista revista = gestionProducto.crearRevista(nombreProducto, autor, editorial, precio, cantidad, id,
				fechaPublicacion, universidad);
		inventario.aumentarRevista(revista);

	}

	public Libro consultarLibro(String nombreLibro) {
		if (this.inventario.isLibroDisponible(nombreLibro)) {
			Libro libro = this.gestionProducto.obtenerLibroNombre(nombreLibro);
			return libro;
		}
		return null;

	}

	public Articulo consultarArticulo(String nombreArticulo) {
		if (this.inventario.isArticuloDisponible(nombreArticulo)) {
			Articulo articulo = this.gestionProducto.obtenerArticuloNombre(nombreArticulo);
			return articulo;
		}
		return null;
	}

	public Revista consultarRevista(String nombreRevista) {
		if (this.inventario.isRevistaDisponible(nombreRevista)) {
			Revista revista = this.gestionProducto.obtenerRevista(nombreRevista);
			return revista;
		}
		return null;
	}

	@Override
	public void listarLibros(List<Libro> lista, Libro libro) {
		for (int j = 0; j < lista.size(); j++) {
			libro = lista.get(j);
			System.out.print(libro.getId() + "   libro, " + libro.getNombreProducto() + ", " + libro.getCantidad()
					+ ",  " + libro.getPrecio() + "\n");
		}

	}

	@Override
	public void listarArticulos(List<Articulo> lista, Articulo articulo) {
		for (int j = 0; j < lista.size(); j++) {
			articulo = lista.get(j);
			System.out.print(articulo.getId() + "   libro, " + articulo.getNombreProducto() + ", "
					+ articulo.getCantidad() + ",  " + articulo.getPrecio() + "\n");
		}

	}

	@Override
	public void listarRevistas(List<Revista> lista, Revista revista) {
		for (int y = 0; y < lista.size(); y++) {
			revista = lista.get(y);
			System.out.print(revista.getId() + "    revista" + revista.getNombreProducto() + ", "
					+ revista.getCantidad() + ",  " + revista.getPrecio() + "\n");
		}

	}

	@Override
	public void columnas(String[] columnas) {
		for (int i = 0; i < columnas.length; i++) {
			System.out.print(columnas[i]);
		}

	}

}
