import java.util.*;

public class BO {

	String Autor;
	String id;
	String Descri��o;

	public BO(String autor, String descri��o, String id) {
		super();
		Autor = autor;
		id = id;
		Descri��o = descri��o;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getDescri��o() {
		return Descri��o;
	}

	public void setDescri��o(String descri��o) {
		Descri��o = descri��o;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		Descri��o = id;
	}

}
