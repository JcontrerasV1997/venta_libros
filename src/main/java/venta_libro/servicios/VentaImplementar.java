package venta_libro.servicios;

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

	@Override
	public void columnas(String[] columnas) {
		for (int i = 0; i < columnas.length; i++) {
			System.out.print(columnas[i]);
		}

	}

	@Override
	public void listar() {
		gestionProducto.listarProductos();

	}

	@Override
	public void listarElegido(int id, int cantidadComprar) {
		gestionProducto.listarElegido(id, cantidadComprar);

	}

	@Override
	public void actualizarInventario(int cantidad, int id) {
		gestionProducto.actualizarInventario(cantidad, id);

	}

	@Override
	public void eliminarProducto(int id) {
		gestionProducto.eliminarProducto(id);

	}

	@Override
	public void listarRevista() {
		gestionProducto.listarRevista();

	}

	@Override
	public void modificarRevista(String nombreProducto, double precio, int cantidad,int id) {
		Revista re = gestionProducto.actualizarRevista(nombreProducto, precio, cantidad,id);
	}

	@Override
	public void listarRevistaPorId(int id) {
	gestionProducto.listarRevistaPorId(id);
		
	}

}
