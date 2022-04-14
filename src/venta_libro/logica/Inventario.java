package venta_libro.logica;

import java.util.ArrayList;
import java.util.List;

import venta_libro.modelo.Articulo;
import venta_libro.modelo.Libro;
import venta_libro.modelo.Revista;

public class Inventario {
	private int cantLibros;
	private int cantArticulos;
	private int cantRevistas;
	private List<Libro> listaLibros;
	private List<Articulo> listaArticulos;
	private List<Revista> listaRevista;

	public Inventario() {
		super();
		this.cantLibros = 0;
		this.cantArticulos = 0;
		this.cantRevistas = 0;
		this.listaLibros = new ArrayList<Libro>();
		this.listaArticulos = new ArrayList<Articulo>();
		this.listaRevista = new ArrayList<Revista>();
	}

	public void aumentarLibro(Libro libro) {
		if (libro != null) {
			this.listaLibros.add(libro);
			this.cantLibros += 1;
		}
	}

	public int getCantLibros() {
		return cantLibros;
	}

	public void setCantLibros(int cantLibros) {
		this.cantLibros = cantLibros;
	}

	public int getCantArticulos() {
		return cantArticulos;
	}

	public void setCantArticulos(int cantArticulos) {
		this.cantArticulos = cantArticulos;
	}

	public int getCantRevistas() {
		return cantRevistas;
	}

	public void setCantRevistas(int cantRevistas) {
		this.cantRevistas = cantRevistas;
	}

	public void decrementarLibro(Libro libro) {
		if (libro != null) {
			Libro lib;
			for (int i = 0; i < listaLibros.size(); i++) {
				lib = listaLibros.get(i);
				if (lib.getNombreProducto().equals(libro.getNombreProducto())) {
					listaLibros.remove(i);
					this.cantLibros -= 1;
					break;
				}
			}
		}
	}

	public void aumentarArticulo(Articulo articulo) {
		if (articulo != null) {
			this.listaArticulos.add(articulo);
			this.cantArticulos += 1;
		}
	}

	public void decrementarArticulo(Articulo articulo) {
		if (articulo != null) {
			Articulo arti;
			for (int i = 0; i < listaLibros.size(); i++) {
				arti = listaArticulos.get(i);
				if (arti.getNombreProducto().equals(arti.getNombreProducto())) {
					listaArticulos.remove(i);
					this.cantLibros -= 1;
					break;
				}
			}
		}
	}

	public void aumentarRevista(Revista revista) {
		if (revista != null) {
			this.listaRevista.add(revista);
			this.cantRevistas += 1;
		}
	}

	public void decrementarRevista(Revista revista) {
		if (revista != null) {
			Revista revi;
			for (int i = 0; i < listaLibros.size(); i++) {
				revi = listaRevista.get(i);
				if (revi.getNombreProducto().equals(revi.getNombreProducto())) {
					listaRevista.remove(i);
					this.cantRevistas -= 1;
					break;
				}
			}
		}
	}

	public boolean isLibroDisponible(String nombre) {
		if (nombre != null) {
			Libro libro;
			for (int i = 0; i < listaLibros.size(); i++) {
				libro = listaLibros.get(i);
				if (libro.getNombreProducto().equals(nombre)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isArticuloDisponible(String nombre) {
		if (nombre != null) {
			Articulo articulo;
			for (int i = 0; i < listaArticulos.size(); i++) {
				articulo = listaArticulos.get(i);
				if (articulo.getNombreProducto().equals(nombre)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isRevistaDisponible(String nombre) {
		if (nombre != null) {
			Revista revista;
			for (int i = 0; i < listaRevista.size(); i++) {
				revista = listaRevista.get(i);
				if (revista.getNombreProducto().equals(nombre)) {
					return true;
				}
			}
		}
		return false;
	}

}
