package venta_libro.persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import venta_libro.modelo.Revista;
import venta_libro.persistencia.Conexion;

public class RevistaDao {
	private Conexion conexion;

	public RevistaDao() {
		this.conexion = new Conexion();
	}

	public void insertarRevista(Revista revista) {

		String query = "INSERT INTO productos(tipoProducto,nombre,autor,editorial,precio,cantidad,fecha,universidad)"
				+ "values(?,?,?,?,?,?,?,?)";

		PreparedStatement ps = this.conexion.getPreparedStatement(query);
		try {
			ps.setInt(1, revista.getId());
			ps.setString(2, revista.getNombreProducto());
			ps.setString(3, revista.getAutor());
			ps.setString(4, revista.getEditorial());
			ps.setDouble(5, revista.getPrecio());
			ps.setInt(6, revista.getCantidad());
			ps.setString(7, revista.getFechaPublicacion());
			ps.setString(8, revista.getUniversidad());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexion.cerrarPrepared(ps);
		}
	}

	public boolean modificarRevista(Revista revista, int id) {
		String query = "update listar set nombre=?, precio=?,cantidad=? where nombretipo=? and id = ?";
		boolean exito = false;
		PreparedStatement ps = this.conexion.getPreparedStatement(query);
		try {
			ps.setString(1, revista.getNombreProducto());
			ps.setDouble(2, revista.getPrecio());
			ps.setInt(3, revista.getCantidad());
			ps.setString(4, "REVISTA");
			ps.setInt(5, revista.getId());
			ps.execute();
			exito=true;
			System.out.println(exito);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexion.cerrarPrepared(ps);
		}
		
		return exito;

	}

}
