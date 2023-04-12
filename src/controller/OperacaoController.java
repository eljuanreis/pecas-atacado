package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacaoController {

	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila queue) throws Exception {
		for (int i = 0; i < 20; i++) {
			Cliente c = (Cliente) queue.remove();
			
			float valorTotal = c.quantidadePecas * c.valorPecas;
			
			System.out.println(c.nome + " Valor total: " + valorTotal);
		}
	}

}
