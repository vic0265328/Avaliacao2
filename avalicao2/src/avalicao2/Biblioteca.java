package avalicao2;

import java.util.*;

public class Biblioteca {
	private List<Livro> biblioteca;
	ListaDeEspera lista = new ListaDeEspera();
	
	public Biblioteca() {
		this.biblioteca = new ArrayList<>();
		
	}
	
	public void adicionarLivro(Livro livro ) {
		biblioteca.add(livro);
		System.out.println("Livro '" + livro.getTitulo() + "' (Código: " + livro.getCodigo() + ") adicionado à biblioteca.");
	}
	
	public void puxarLista(ListaDeEspera l) {
		
		
	}
	
	public Livro buscarLivroTitulo(String titulo) {
		for(Livro livro : biblioteca) {
			if(livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		return null;	
	}
	
	public Livro buscarLivroCodigo(int codigo) {
		for(Livro livro : biblioteca) {
			if(livro.getCodigo() == codigo) {
				return livro;
			}
		}
		return null;
	}
	
	public void emprestarLivro(String tituloLivro , Pessoa pessoa) {
		Livro livro = buscarLivroTitulo(tituloLivro);
		if(livro != null) {
			if(livro.getDisponibilidade()) {
				livro.setDisponibilidade(false);
				pessoa.setCodLivro(livro.getCodigo());
				System.out.println(pessoa.getNome() + " pegou o livro " + livro.getTitulo()+"(Codigo: " + livro.getCodigo() + ") do autor " + livro.getAutor() + " emprestado." );
				
			}else {
				System.out.println("Livro " + livro.getTitulo() + "(Codigo: " + livro.getCodigo() + ") esta indisponivel, você sera colocado em lista de espera. Grato a coordenação!");
				lista.adicionarLeitor(pessoa);
			}
		}else {
			System.out.println("Livro " + livro.getTitulo() + " não encontrado na biblioteca.");
		}
	}
	
	public void devolverLivro(int codigoLivro, Pessoa pessoaQueDevolveu) {
		Livro livro = buscarLivroCodigo(codigoLivro);
		if (livro != null) {
			if(!livro.getDisponibilidade()) {
				livro.setDisponibilidade(true);
				if(pessoaQueDevolveu != null && pessoaQueDevolveu.getCodLivro() == codigoLivro) {
					pessoaQueDevolveu.setCodLivro(0);
				}
				System.out.println("Livro: " + livro.getTitulo() + "(Codigo: " + livro.getCodigo() + ") devolvido.");
				
				if (this.lista.verificarsetemlista()) {
					Pessoa proximoLeitor = this.lista.proxima();
					if (proximoLeitor != null) {
						System.out.println("Notificando " + proximoLeitor.getNome() + ": O livro " + livro.getTitulo() + " agora esta diponivel.");
					}
				}
			}else {
				System.out.println("O livro " + livro.getTitulo() + " ja esta disponivel na nossa biblioteca.");
			}
		}else {
			System.out.println("Livre com codigo " + codigoLivro + " não foi encontrado na biblioteca. ");
		}
	}
	
	public ListaDeEspera getLista() {
		return this.lista;
	}
	
	public void listarLivros() {
		if (this.biblioteca.isEmpty()) {
			System.out.println("A biblioteca esta vazia.");
		}else {
			System.out.println("\n--- Livros na biblioteca ---");
			for(Livro livro :this.biblioteca) {
				livro.exibirDetalhes();
			}
		}
	}
	
	

}
//classe criada nessa atualizacao e em teste