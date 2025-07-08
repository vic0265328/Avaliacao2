package avalicao2;

import java.util.*;

public class Livro {
	private String titulo;
	private String autor;
	private int codigo;
	private boolean disponibilidade;
	
	public Livro(String titulo,String autor, int codigo,boolean disponibilidade ) {
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = codigo;
		this.disponibilidade = disponibilidade;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	
	public String getAutor() {
		return this.autor;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public boolean getDisponibilidade() {
		return this.disponibilidade;
	}
	
	public void setTitulo() {
		this.titulo = titulo;
	}
	
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	public void exibirDetalhes() {
		String statusDisponibilidade;
		if(this.disponibilidade) {
			statusDisponibilidade ="Sim";
		}else {
			statusDisponibilidade ="Não";
		}
		System.out.println("Titulo: " + this.titulo +
				           ", Autor: " + this.autor +
				           ", Codigo: " + this.codigo +
				           ", Disponivel: " + statusDisponibilidade);
	}
}
