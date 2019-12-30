package classes;

import enums.Plano;

public class Aluno {
	private int matricula;
	private String nome;
	private int idade;
	private Plano tipoPLano;
	
	public Aluno(int matricula, String nome, int idade, Plano tipoPlano) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.tipoPLano = tipoPlano;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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
	
	
	public Plano getTipoPLano() {
		return tipoPLano;
	}

	public void setTipoPLano(Plano tipoPLano) {
		this.tipoPLano = tipoPLano;
	}

	public String toString() {
		return matricula 
				+ "\n"
				+ nome 
				+ "\n" 
				+ idade 
				+ "\n" 
				+ tipoPLano;
	}	
}
