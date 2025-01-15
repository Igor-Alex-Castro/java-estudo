package entities;

public class Aluno {
	
	private String nome;
	private double[] notas = new double[2]; 
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	
	}

	public Aluno(String nome, double[] notas) {
		super();
		this.nome = nome;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public boolean aprovado() {
		
		if(mediaAluno() >= 6 ) {
			return true;
		}
		return false;
	}
	
	public double mediaAluno() {
		return (this.notas[0] + this.notas[1])/this.notas.length;
	}
	
}
