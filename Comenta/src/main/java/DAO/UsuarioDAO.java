package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DTO.UsuarioDTO;

public class UsuarioDAO {
	
	Connection conn;
	
	public ResultSet autentiacaoUsuario (UsuarioDTO objusuariodtdto) {
		conn = new ConexaoDAO().conectaBD();
		
		try {
			String sql = "select * from dadosPessoais where nome = ? and senha = ?";
			
			PreparedStatement pstm = conn.prepareStatement(sql); 
			
			pstm.setString(1, objusuariodtdto.getNome_usuario());
			pstm.setString(2, objusuariodtdto.getSenha_usuario());
			
			ResultSet rs = pstm.executeQuery();
			return rs;
			
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
			return null;
		}
	} 
}
