package avalicao2;

import java.util.*;

public class ListaDeEspera {
	private List<Pessoa> listaDeEspera;
	
	public ListaDeEspera() {
		this.listaDeEspera = new ArrayList<>();
	}
	
	public void adicionarLeitor(Pessoa pessoa) {
		listaDeEspera.add(pessoa);
		System.out.println(pessoa.getNome() + " foi adicionado(a) à lista de espera.");
	}
	
	public Pessoa proxima() {
		if(!listaDeEspera.isEmpty()) {
			return listaDeEspera.remove(0);
		}
		return null;
	}
	
	public boolean verificarsetemlista() {
		return !listaDeEspera.isEmpty();
		
	}
	
	public int quantosLeitores() {
		return listaDeEspera.size();
	}
	
    public void exibirLista() {
        if (listaDeEspera.isEmpty()) {
            System.out.println("A lista de espera está vazia.");
        } else {
            System.out.println("Leitores na lista de espera:");
            for (Pessoa p : listaDeEspera) {
                p.exibirDetalhes();
            }
        }
    }


}
//classe criada nessa atualizacao