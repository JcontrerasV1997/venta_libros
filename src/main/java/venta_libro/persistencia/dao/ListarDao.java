package venta_libro.persistencia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import venta_libro.persistencia.Conexion;

public class ListarDao {
	private Conexion conexion;

	public ListarDao() {
		this.conexion = new Conexion();
	}

	public void listarProductos() {
		String query = "select * from listar";
		Statement state = conexion.getStatement();

		try {
			ResultSet resultado = state.executeQuery(query);
			while (resultado.next()) {
				System.out.println(resultado.getInt("id") + "  " + resultado.getString("nombreTipo") + "  "
						+ resultado.getString("nombre") + "  " + resultado.getInt("cantidad") + "  "
						+ resultado.getInt("precio"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexion.cerrarStatement(state);
		}
	}

}
