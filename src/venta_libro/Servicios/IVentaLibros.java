package venta_libro.Servicios;

import java.util.List;

import venta_libro.modelo.Articulo;
import venta_libro.modelo.Libro;
import venta_libro.modelo.Revista;

public interface  IVentaLibros {
	
	
	public void adicionarLibro(String nombreProducto, String autor, String editorial, double precio, int cantidad, int id, int numeroPaginas, String isbn);
	public void adicionarArticulo(String nombreProducto, String autor, String editorial, double precio,int cantidad,int id, int numeroRevisiones, int numeroCitaciones);
	public void adicionarRevista(String nombreProducto, String autor, String editorial, double precio, int cantidad, int id,String fechaPublicacion, String universidad );
	public void recorrido(String[] columna);
	public Libro consultarLibro(String libro);
	public Articulo consultarArticulo(String articulo);
	public 	Revista consultarRevista(String revista);
}

