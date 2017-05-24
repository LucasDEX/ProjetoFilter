package model;

import java.io.Serializable;
import java.util.List;

import javax.servlet.RequestDispatcher;

import service.MuralService;

public class CadastrarLogin implements Serializable {
    private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String email;
	private String senha;
	private String login;
	private int nivel;

	public CadastrarLogin() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	@Override
	public String toString() {
		return "Area [id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastrarLogin other = (CadastrarLogin) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}










//MuralService ms = new MuralService();
//RequestDispatcher view = null;
//List<Mural> lista = ms.carregarTodosPosts();
//request.setAttribute("mural", lista);
//view = request.getRequestDispatcher("mural.jsp");

//view.forward(request, response);

//}
