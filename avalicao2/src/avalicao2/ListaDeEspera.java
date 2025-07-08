package avalicao2;

import java.util.*;

public class ListaDeEspera {
	private List<Pessoa> listaDeEspera;
	
	public ListaDeEspera() {
		this.listaDeEspera = new ArrayList<>();
	}
	
	public void adicionarLeitor(Pessoa pessoa) {
		listaDeEspera.add(pessoa);
	}
	
	public Pessoa proxim() {
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


}
//classe criada nessa atualizacao