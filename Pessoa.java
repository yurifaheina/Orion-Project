import java.util.*;

public class Pessoa {

	String Id;
	String Senha;
	String Login;

	public Pessoa(String id, String senha, String login) {
		super();
		Id = id;
		Senha = senha;
		Login = login;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

}
