import java.util.*;

public class BO {

	String Autor;
	String id;
	String Descrição;

	public BO(String autor, String descrição, String id) {
		super();
		Autor = autor;
		id = id;
		Descrição = descrição;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		Descrição = descrição;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		Descrição = id;
	}

}
