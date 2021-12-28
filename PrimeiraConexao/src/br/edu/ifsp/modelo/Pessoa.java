package br.edu.ifsp.modelo;

public class Pessoa {
	
	private int id;
	private String nome;
	private int idade;
	private String endereco;
	
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
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return this.id + " - " + nome + " - " + this.idade + " anos - Endereço: " + this.endereco;
		
	}
	
}
