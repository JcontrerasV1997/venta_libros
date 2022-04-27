package venta_libro.persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import venta_libro.modelo.Libro;
import venta_libro.persistencia.Conexion;

public class LibroDao {

	private Conexion conexion;

	public LibroDao() {
		this.conexion = new Conexion();
	}

	public void insertarLibro(Libro libro) {

		String query = "INSERT INTO productos(tipoProducto,nombre,autor,editorial,precio,cantidad,numPaginas,isbn)"
				+ "values(?,?,?,?,?,?,?,?)";

		PreparedStatement ps = this.conexion.getPreparedStatement(query);
		try {
			ps.setInt(1, libro.getId());
			ps.setString(2, libro.getNombreProducto());
			ps.setString(3, libro.getAutor());
			ps.setString(4, libro.getEditorial());
			ps.setDouble(5, libro.getPrecio());
			ps.setInt(6, libro.getCantidad());
			ps.setInt(7, libro.getnumeroPaginas());
			ps.setString(8, libro.getIsbn());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexion.cerrarPrepared(ps);
		}
	}
	
	

}
