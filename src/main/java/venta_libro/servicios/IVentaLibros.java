package venta_libro.servicios;

public interface IVentaLibros {

	public void adicionarLibro(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, int numeroPaginas, String isbn);

	public void adicionarArticulo(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, int numeroRevisiones, int numeroCitaciones);

	public void adicionarRevista(String nombreProducto, String autor, String editorial, double precio, int cantidad,
			int id, String fechaPublicacion, String universidad);

	public void columnas(String[] columnas);

	public void listar();

	public void listarElegido(int id, int cantidadComprar);

	public void listarRevista();

	public void modificarRevista(String nombreProducto, double precio, int cantidad,int id);

	public void eliminarProducto(int id);

	public void listarRevistaPorId(int id);

	public void actualizarInventario(int cantidad, int id);

}
