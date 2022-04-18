package venta_libro.modelo;

public class Libro extends Producto {

	private int numeroPaginas;
	private String isbn;

	public Libro() {
		super();
		this.numeroPaginas = 0;
		this.isbn = new String();
	}

	public Libro(int nuneroPaginas, String isbn) {
		super();
		this.numeroPaginas = nuneroPaginas;
		this.isbn = isbn;
	}

	

	public Libro(String nombreProducto, String autor, String editorial, double precio, int cantidad, int id,
			int numeroPaginas, String isbn) {
		super(nombreProducto, autor, editorial, precio, cantidad, id);
		this.numeroPaginas = numeroPaginas;
		this.isbn = isbn;
	}

	public int getnumeroPaginas() {
		return numeroPaginas;
	}

	public void setnumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void cambiarnumeroPaginas(int revisiones) {

		this.numeroPaginas = revisiones;
	}

}
