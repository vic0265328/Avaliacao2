package avalicao2;

import java.util.*;

public class Livro {
	private String titulo;
	private String autor;
	private boolean disponibilidade;
	
	public Livro(String titulo, String autor, boolean disponibilidade ) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponibilidade = disponibilidade;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setTitulo() {
		this.titulo = titulo;
	}
}
