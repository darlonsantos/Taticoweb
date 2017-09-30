package br.com.taticoweb.entity;

import java.util.Map;

public class Pessoa {

	private String nome;

	private Pessoa[] filhos;
	
	private Map<String, Pessoa> irmaos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa[] getFilhos() {
		return filhos;
	}

	public void setFilhos(Pessoa[] filhos) {
		this.filhos = filhos;
	}

	public Map<String, Pessoa> getIrmaos() {
		return irmaos;
	}

	public void setIrmaos(Map<String, Pessoa> irmaos) {
		this.irmaos = irmaos;
	}

}
