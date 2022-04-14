package venta_libro.Servicios;

import java.util.List;

import venta_libro.logica.GestionLibros;
import venta_libro.logica.Inventario;
import venta_libro.modelo.Articulo;
import venta_libro.modelo.Libro;
import venta_libro.modelo.Revista;

public class VentaImplementar extends Algo {
	private GestionLibros gestionProducto;
	private Inventario inventario;

	public VentaImplementar() {

	}

	@Override
	public void recorrido2(List<Libro> listaLibros, Libro recorrido) {
		for (int j = 0; j < listaLibros.size(); j++) {
			recorrido = listaLibros.get(j);
			System.out.print(recorrido.getId() + "   libro, " + recorrido.getNombreProducto() + ", "
					+ recorrido.getCantidad() + ",  " + recorrido.getPrecio() + "\n");
		}

	}

}
