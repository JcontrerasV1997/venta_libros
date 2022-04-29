package venta_libro.presentacion;

import java.util.Scanner;
import venta_libro.servicios.IVentaLibros;
import venta_libro.logica.Inventario;
import venta_libro.modelo.Producto;
import venta_libro.servicios.VentaImplementar;

public class Principal {
	public static void main(String[] args) {
		String[] columna = { "Id | ", "Tipo | ", "nombre | ", "Cantidad | ", "Precio \n \n" };
		Inventario inventario = new Inventario();
		Producto ventaProducto = new Producto();
		IVentaLibros venta = new VentaImplementar();

		Scanner leer = new Scanner(System.in);
		int lecturaMenu, lecturaMenuAgregar, leeId, opcion = 0, cantidad, cantidadComprar, revisiones, paginas,
				citaciones, cantActual = 0;
		double precio, totalPrecio;
		String nombre, autor, editorial, universidad, fecha, isbn;

		do {
			System.out.println("\n \n******Libreria Indra ****** \n");
			try {
				System.out.println("\n Escoja opcion 1 crear Productos, 2 Eliminar, 3 Vender, 4 Modificar revista");
				lecturaMenu = leer.nextInt();
				// Menu general
				switch (lecturaMenu) {
				case 1:
					System.out.println("\n Que tipo de producto desea agregar 1 libro, 2 articulo, 3 revista");
					lecturaMenuAgregar = leer.nextInt();
					// Menu Interno
					switch (lecturaMenuAgregar) {
					case 1:
						// venta.adicionarLibro(null, null, null, opcion, opcion2, null);
						// venta.consultarLibro(null).getAutor();
						System.out.println("\n Agregar tipo Libros");

						System.out.println("\n Ingrese el nombre");
						nombre = leer.next();

						System.out.println("\n Ingrese el autor");
						autor = leer.next();

						System.out.println("\n Ingrese editorial");
						editorial = leer.next();

						System.out.println("\n Ingrese el precio");
						precio = leer.nextDouble();

						System.out.println("\n Ingrese la cantidad");
						cantidad = leer.nextInt();

						System.out.println("\n Ingrese las cantidad de paginas");
						paginas = leer.nextInt();

						System.out.println("\n Ingrese el isbn");
						isbn = leer.next();

						venta.adicionarLibro(nombre, autor, editorial, precio, cantidad, 1, paginas, isbn);
						System.out.println("\n Libro añadido satisfactoriamente");
						// Libro libro = new Libro(nombre, autor, editorial, precio, cantidad, id,
						// paginas, isbn);
						// listaLibros.add(libro);
						// mapProductos.put(id, libro);

						System.out.println("\n Desea Volver al menu principal");
						opcion = leer.nextInt();

						break;
					case 2:
						System.out.println("\n agregar tipo  Articulos");

						System.out.println("\n Ingrese el nombre");
						nombre = leer.next();

						System.out.println("\n Ingrese el autor");
						autor = leer.next();

						System.out.println("\n Ingrese editorial");
						editorial = leer.next();

						System.out.println("\n Ingrese el precio");
						precio = leer.nextFloat();

						System.out.println("\n Ingrese la cantidad");
						cantidad = leer.nextInt();

						System.out.println("\n Ingrese numero de revisiones la revision");
						revisiones = leer.nextInt();

						System.out.println("\n Ingrese numero de citaciones");
						citaciones = leer.nextInt();

						// Articulo articulo = new Articulo(nombre, autor, editorial, precio, cantidad,
						// id, revisiones,citaciones);
						// listaArticulo.add(articulo);
						// inventario.aumentarArticulo(articulo);
						// mapProductos.put(id, articulo);

						venta.adicionarArticulo(nombre, autor, editorial, precio, cantidad, 3, revisiones, citaciones);

						System.out.println("Articulo añadido sastifactoriamente");
						System.out.println("\n Desea Volver al menu principal");
						opcion = leer.nextInt();
						break;
					case 3:
						System.out.println("\n agregar Revista");

						System.out.println("\n Ingrese el nombre");
						nombre = leer.next();

						System.out.println("\n Ingrese el autor");
						autor = leer.next();

						System.out.println("\n Ingrese editorial");
						editorial = leer.next();

						System.out.println("\n Ingrese el precio");
						precio = leer.nextFloat();

						System.out.println("\n Ingrese la cantidad");
						cantidad = leer.nextInt();

						System.out.println("\n Ingrese fecha publicacion");
						fecha = leer.next();

						System.out.println("\n Ingrese la universidad");
						universidad = leer.next();

						// Revista revista = new Revista(nombre, autor, editorial, precio, cantidad, id,
						// fecha,universidad);
						// listaRevista.add(revista);
						// inventario.aumentarRevista(revista);
						// mapProductos.put(id, revista);

						venta.adicionarRevista(nombre, autor, editorial, precio, cantidad, 2, fecha, universidad);
						System.out.println("Revista añadida sastifactoriamente");
						System.out.println("\n Desea Volver al menu principal");
						opcion = leer.nextInt();
						break;
					default:
						System.out.println("Opcion no validada");
						break;
					}
					break;
				case 2:
					System.out.println("***** Eliminar Producto *****");
					venta.columnas(columna);
					venta.listar();
					System.out.println("\n Seleccione el id para eliminar");
					leeId = leer.nextInt();
					venta.eliminarProducto(leeId);
					System.out.println("Producto Eliminado");

					System.out.println("\n Desea Volver al menu principal");
					opcion = leer.nextInt();

					break;
				case 3:
					System.out.println("\n ******** Seccion Ventas *************");
					System.out.println("\n ******** Que quiere comprar? *************");
					venta.columnas(columna);
					venta.listar();
					System.out.println("\n Seleccione el id para comprar del del producto");
					leeId = leer.nextInt();
					System.out.println("\n Cantidad que desea comprar");

					cantidadComprar = leer.nextInt();
					venta.listarElegido(leeId, cantidadComprar);
					venta.actualizarInventario(cantidadComprar, leeId);

					System.out.println("\n Compra exitosa");

					System.out.println("\n Desea Volver al menu principal");
					opcion = leer.nextInt();
					break;

				case 4:
					System.out.println("Seccion modificar revista");
					venta.columnas(columna);
					venta.listarRevista();

					System.out.println("\n Seleccione el id para modificar el producto");
					leeId = leer.nextInt();

					System.out.println("\n Ingrese el nombre");
					nombre = leer.next();

					System.out.println("\n Ingrese el precio");
					precio = leer.nextFloat();

					System.out.println("\n Ingrese la cantidad");
					cantidad = leer.nextInt();

					venta.modificarRevista(nombre, precio, cantidad, leeId);
					System.out.println("Revista modificada");
					System.out.println("\n Desea Volver al menu principal");
					opcion = leer.nextInt();
					break;

				default:
					System.out.println("Opcion no validada");
					break;
				}
			} catch (Exception e) {
				System.out.println("Error Controlado");

			}
		} while (opcion == 1);
	}
}
