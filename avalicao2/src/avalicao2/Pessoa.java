package avalicao2;

public class Pessoa {
	private String nome;
	private String contato;
	private int codLivro;
	
	public Pessoa(String nome, String contato, int codLivro) {
		this.nome = nome;
		this.contato = contato;
		this.codLivro = codLivro;
	}

	public String getNome() {
		return this.nome;
	}
	public String getContato() {
		return this.contato;
	}
	public int getCodLivro() {
		return this.codLivro;
	}
	public void setNome() {
		this.nome = nome;
	}
	public void setContato() {
		this.contato = contato;
	}
	public void setCodLivro(int codlivro) {
		this.codLivro = codLivro;
	}
	
	public void exibirDetalhes() {
	       System.out.println("Nome: " + this.nome +
	                          ", Contato: " + this.contato +
	                          ", Livro Emprestado (Código): " + this.codLivro);
	    }
}
//classe criada nessa atualizacao