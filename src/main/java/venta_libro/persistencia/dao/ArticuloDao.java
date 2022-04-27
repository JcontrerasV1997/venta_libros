package venta_libro.persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import venta_libro.modelo.Articulo;
import venta_libro.persistencia.Conexion;

public class ArticuloDao {
	private Conexion conexion;
	public ArticuloDao() {
		this.conexion = new Conexion();
	}
	public void insertarArticulo(Articulo articulo) {
		String query = "INSERT INTO productos(tipoProducto,nombre,autor,editorial,precio,cantidad,numPaginas,isbn,fecha,universidad,numRevisiones,numCitaciones)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = this.conexion.getPreparedStatement(query);
		try {
			ps.setInt(1, articulo.getId());
			ps.setString(2, articulo.getNombreProducto());
			ps.setString(3, articulo.getAutor());
			ps.setString(4, articulo.getEditorial());
			ps.setDouble(5, articulo.getPrecio());
			ps.setInt(6, articulo.getCantidad());
			ps.setInt(11, articulo.getNumeroRevisiones());
			ps.setInt(12, articulo.getNumeroCitaciones());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			this.conexion.cerrarPrepared(ps);
		}
	}

}
