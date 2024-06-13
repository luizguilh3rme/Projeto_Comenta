package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
public class ConexaoDAO {

//		private static final String drive = "com.mysql.jdbc.Driver";
//		private static final String url = "jdbc:mysql://localhost/Comenta";
//		private static final String usuario = "root";
//		private static final String senha = "96768655";
		
		
		public Connection conectaBD(){
			Connection conn = null;
			
			try {
				String url = "jdbc:mysql://localhost:3306/comenta?user=root&password=96768655";
				conn = DriverManager.getConnection(url);
				
				
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
			}
			return conn;
		}
}
