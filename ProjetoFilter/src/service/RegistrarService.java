package service;

import java.util.List;

import dao.RegistrarDAO;
import model.CadastrarLogin;


public class RegistrarService {
	RegistrarDAO dao = new RegistrarDAO();
	
	public int criar(CadastrarLogin cliente) {
		return dao.criar(cliente);
	}
	
	public void atualizar(CadastrarLogin cliente){
		dao.atualizar(cliente);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public CadastrarLogin carregar(String login){
		return dao.carregar(login);
	}
	
	public CadastrarLogin login(String login, String senha){
		return dao.login(login, senha);
	}
	
	public List<CadastrarLogin> carregarTodosClientes(){
		return dao.carregarTodasAreas();
	}

}
