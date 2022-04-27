package venta_libro.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	private Connection con;

	public Conexion() {
		this.getConexion();
	}

	public Connection getConexion() {
		if (this.con == null) {
			try {
				con = DriverManager.getConnection(Constantes.url, Constantes.USER, Constantes.PASSWORD);

			} catch (SQLException throwables) {
				throwables.printStackTrace();

			} finally {

			}
		}
		return this.con;
	}

	public void cerrarConexion() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		Statement st = null;
		try {
			st = this.con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}

	public void cerrarStatement(Statement statement) {
		try {
			if (statement != null)
				statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public PreparedStatement getPreparedStatement(String sql) {
		PreparedStatement ps = null;
		try {
			ps = this.con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ps;

	}

	public void cerrarPrepared(PreparedStatement ps) {
		try {
			if (ps != null)
				ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cerrarConexion(Statement st) {
		try {
			if (st != null)
				st.close();

			if (con != null)
				con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
