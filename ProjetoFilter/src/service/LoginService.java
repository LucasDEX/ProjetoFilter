package service;

import model.CadastrarLogin;
import dao.LoginDAO;

public class LoginService {
	
	public boolean validar(CadastrarLogin usuario){
		LoginDAO dao = new LoginDAO();
		return dao.validar(usuario);
	}
}

