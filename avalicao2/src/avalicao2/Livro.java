package avalicao2;

import java.util.*;

public class Livro {
	private String titulo;
	private String nome;
	private String autor;
	private int quantidade;
	private boolean disponibilidade;
	
	public Livro(String titulo,String nome,String autor, int quantidade,boolean disponibilidade ) {
		this.titulo = titulo;
		this.nome = nome;
		this.autor = autor;
		this.quantidade = quantidade;
		this.disponibilidade = disponibilidade;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setTitulo() {
		this.titulo = titulo;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public void setAutor() {
		this.autor = autor;
	}
	
	public void setQuantidade() {
		this.quantidade =
	}
	
	public void setDisponibilidade() {
		this.disponibilidade = disponibilidade;
	}
}
//Alteracao na classe foi adicionado NOME e QUANTIDADE!