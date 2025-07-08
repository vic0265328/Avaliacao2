package avalicao2;

import java.util.*;

public class Biblioteca {
	private List<Livro> biblioteca;
	ListaDeEspera lista = new ListaDeEspera();
	
	public Biblioteca() {
		this.biblioteca = new ArrayList<>();
		
	}
	
	public void adicionarLivro(Livro livro) {
		biblioteca.add(livro);
	}
	
	

}
//classe criada nessa atualizacao e em teste