package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.CadastrarLogin;

public class LoginDAO {
	public boolean validar(CadastrarLogin usuario) {
		String sqlSelect = "SELECT ID, Login, Senha FROM usuario "
				+ "WHERE Login = ? and Senha = ?";
		// pega a conexão em um try normal para que ela não seja fechada
		try {
			Connection conn = ConnectionFactory.obterConexao();
			// usando o try with resources do Java 7, que fecha o que abriu
			try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setString(1, usuario.getLogin());
				stm.setString(2, usuario.getSenha());
				try (ResultSet rs = stm.executeQuery();) {
					if (rs.next()) {
						usuario.setId(rs.getInt("ID"));
						usuario.setLogin(rs.getString("Login"));
						usuario.setSenha(rs.getString("Senha"));
						return true;
					} else {
						usuario.setId(0);
						usuario.setLogin(null);
						usuario.setSenha(null);
						return false;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		return false;
	}
}









//request.setCharacterEncoding("UTF-8");
//response.setCharacterEncoding("UTF-8");
//HttpServletRequest req = (HttpServletRequest)request;
//HttpSession session = req.getSession();
//RegistrarELogin login = (RegistrarELogin)session.getAttribute("logado");

//if(login == null){