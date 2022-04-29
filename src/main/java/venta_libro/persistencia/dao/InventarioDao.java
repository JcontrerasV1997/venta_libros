package venta_libro.persistencia.dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import venta_libro.persistencia.Conexion;

public class InventarioDao {

	private Conexion conexion;

	public InventarioDao() {
		this.conexion = new Conexion();
	}

	public void actualizarInventarioProductos(int cantidad, int id) {
		String query= "{call actualizarInventario (?,?)}";
		CallableStatement procedimiento= this.conexion.getCallableStatement(query);
		try {
			procedimiento.setInt(1,cantidad);
			procedimiento.setInt(2,id);
			procedimiento.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.conexion.cerrarCall(procedimiento);
		}
	}

}
