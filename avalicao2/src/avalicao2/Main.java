package avalicao2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Biblioteca minhaBiblioteca = new Biblioteca();
		int opcao;
		
		do {
			  System.out.println("\n--- Menu da Biblioteca ---");
	            System.out.println("1. Cadastrar novo livro");
	            System.out.println("2. Listar todos os livros");
	            System.out.println("3. Emprestar livro");
	            System.out.println("4. Devolver livro");
	            System.out.println("5. Ver lista de espera");
	            System.out.println("6. Quantos leitores na lista de espera?");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = sc.nextInt();
	            sc.nextLine();
	            
	            switch (opcao) {
	            case 1:
	            	System.out.print("Titulo do livro: ");
	            	String titulo = sc.nextLine();
	            	System.out.print("Autor do livro: ");
	            	String autor = sc.nextLine();
	            	System.out.print("Código do livro: ");
	            	int codigoLivro = sc.nextInt();
	            	sc.nextLine();
	            	System.out.print("Disponibilidade inicial (true/false): ");
	            	boolean disponibilidadeInicial = sc.nextBoolean();
	            	sc.nextLine();
	            	
	            	Livro novoLivro = new Livro(titulo,autor,codigoLivro,disponibilidadeInicial);
	                minhaBiblioteca.adicionarLivro(novoLivro);
	                break;
	             case 2:
	            	 minhaBiblioteca.listarLivros();
	            	 break;
	             case 3:
	            	 System.out.print("Titulo do livro para emprestar: ");
	            	 String tituloEmprestado = sc.nextLine();
	            	 System.out.print("Nome do leitor: ");
	            	 String nomeLeitor = sc.nextLine();
	            	 System.out.print("Contato do leitor: ");
	            	 String contatoLeitor = sc.nextLine();
	            	 
	            	 Pessoa leitor = new Pessoa(nomeLeitor, contatoLeitor, 0);
	            	 minhaBiblioteca.emprestarLivro(tituloEmprestado, leitor);
	                 break;
	             case 4:
	            	 System.out.print("Código do livro que deseja devolver: ");
	            	 int codDevolucao = sc.nextInt();
	            	 System.out.println("Nome do leitor que está devolvendo: ");
	            	 String nomeDevolucao = sc.nextLine();
	            	 System.out.println("Contato do leitor que está devolvendo");
	            	 String contatoDevolucao = sc.nextLine();
	            	 
	            	 Pessoa pessoaDevolucao = new Pessoa(nomeDevolucao, contatoDevolucao, codDevolucao);
	            	 minhaBiblioteca.devolverLivro(codDevolucao, pessoaDevolucao);
	            	 break;
	             case 5:
	            	 minhaBiblioteca.getLista().exibirLista();
	            	 break;
	             case 6:
	            	 System.out.println("Há " + minhaBiblioteca.getLista().quantosLeitores() + " leitores na lista de espera.");
	            	 break;
	             case 0:
	            	 System.out.println("Saindo da biblioteca. Volte logo!");
	            	 break;
	             default:
	            	 System.out.println("Opção inválida. Por favor, tente novamente.");
	            }
		}while (opcao != 0);
			
		sc.close();
	}
}
