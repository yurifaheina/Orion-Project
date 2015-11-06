import java.util.*;
public class Usuario {
	
	String Nome;
	String CPF;
	String RG;
	String Pai;
	String EstadoCivil;
	String Estado;
	String Pais;
	String Municipio;
	String Email;
	String Nascimento;
	String TelefoneFixo;
	String TelefoneCelular;
	String MoradiaRua;
	String Bairro;
	String CEP;
	String MunicipioLogradouro;
	String TipoMoradia;
	String Complemento;
	String PontoReferencia;
	
	public Usuario(String nome, String cPF, String rG, String pai,
			String estadoCivil, String estado, String pais, String municipio,
			String email, String nascimento, String telefoneFixo,
			String telefoneCelular, String moradiaRua, String bairro,
			String cEP, String municipioLogradouro, String tipoMoradia,
			String complemento, String pontoReferencia) {
		super();
		Nome = nome;
		CPF = cPF;
		RG = rG;
		Pai = pai;
		EstadoCivil = estadoCivil;
		Estado = estado;
		Pais = pais;
		Municipio = municipio;
		Email = email;
		Nascimento = nascimento;
		TelefoneFixo = telefoneFixo;
		TelefoneCelular = telefoneCelular;
		MoradiaRua = moradiaRua;
		Bairro = bairro;
		CEP = cEP;
		MunicipioLogradouro = municipioLogradouro;
		TipoMoradia = tipoMoradia;
		Complemento = complemento;
		PontoReferencia = pontoReferencia;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getPai() {
		return Pai;
	}

	public void setPai(String pai) {
		Pai = pai;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNascimento() {
		return Nascimento;
	}

	public void setNascimento(String nascimento) {
		Nascimento = nascimento;
	}

	public String getTelefoneFixo() {
		return TelefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		TelefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return TelefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		TelefoneCelular = telefoneCelular;
	}

	public String getMoradiaRua() {
		return MoradiaRua;
	}

	public void setMoradiaRua(String moradiaRua) {
		MoradiaRua = moradiaRua;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getMunicipioLogradouro() {
		return MunicipioLogradouro;
	}

	public void setMunicipioLogradouro(String municipioLogradouro) {
		MunicipioLogradouro = municipioLogradouro;
	}

	public String getTipoMoradia() {
		return TipoMoradia;
	}

	public void setTipoMoradia(String tipoMoradia) {
		TipoMoradia = tipoMoradia;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getPontoReferencia() {
		return PontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		PontoReferencia = pontoReferencia;
	}
	
	
	
	

}
