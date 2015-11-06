import java.util.*;

public class Veiculo {

	String Placa;
	String Marca;
	String Modelo;
	String Cor;
	String Ano;
	String Observacao;

	public Veiculo(String placa, String marca, String modelo, String cor,
			String ano, String observacao) {
		super();
		Placa = placa;
		Marca = marca;
		Modelo = modelo;
		Cor = cor;
		Ano = ano;
		Observacao = observacao;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		Ano = ano;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

}
