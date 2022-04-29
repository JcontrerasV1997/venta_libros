package venta_libro.persistencia.dao;


import java.sql.SQLException;
import java.sql.Statement;

import venta_libro.persistencia.Conexion;

public class EliminarDao {
	private Conexion conexion;

	public EliminarDao() {

		this.conexion = new Conexion();
	}

	public void eliminarProducto(int id) {

		String query = "DELETE FROM productos where id = " + id;
		Statement state = this.conexion.getStatement();

		try {
			state.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexion.cerrarStatement(state);
		}

	}

}
