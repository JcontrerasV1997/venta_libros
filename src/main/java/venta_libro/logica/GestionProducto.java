package venta_libro.logica;

import java.util.Iterator;

import venta_libro.modelo.Articulo;
import venta_libro.modelo.Libro;
import venta_libro.modelo.Revista;
import venta_libro.persistencia.dao.ArticuloDao;
import venta_libro.persistencia.dao.LibroDao;
import venta_libro.persistencia.dao.ListarDao;
import venta_libro.persistencia.dao.RevistaDao;

public class GestionProducto {

	public GestionProducto() {

	}

	public Libro crearLibro(String nombreProducto, String autor, String editorial, double precio, int cantidad, int id,
			int numeroPaginas, String isbn) {

		Libro libro = new Libro(nombreProducto, autor, editorial, precio, cantidad, id, numeroPaginas, isbn);
		LibroDao libroDao = new LibroDao();
		libroDao.insertarLibro(libro);
		return libro;
	}

	public Libro obtenerLibroNombre(String nombre) {
		return new Libro();
	}

	public Articulo crearArticulo(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, int numeroRevisiones, int numeroCitaciones) {

		Articulo articulo = new Articulo(nombreProducto, autor, editorial, precio, cantidad, id, numeroRevisiones,
				numeroCitaciones);
		ArticuloDao articuloDao = new ArticuloDao();
		articuloDao.insertarArticulo(articulo);
		return articulo;
	}

	public Articulo obtenerArticuloNombre(String nombre) {
		return new Articulo();
	}

	public Revista crearRevista(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, String fechaPublicacion, String universidad) {
		Revista revista = new Revista(nombreProducto, autor, editorial, precio, cantidad, id, fechaPublicacion,
				universidad);
		RevistaDao revistaDao = new RevistaDao();
		revistaDao.insertarRevista(revista);

		return revista;
	}

	public void listarProductos() {
		ListarDao listar = new ListarDao();
		listar.listarProductos();
	
	}

	public Revista obtenerRevista(String nombre) {
		return new Revista();
	}
}
