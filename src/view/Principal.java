package view;

import controller.OperacaoController;
import model.Cliente;
import br.edu.fateczl.filaobj.*;

public class Principal {

	public static void main(String[] args) throws Exception {
		Fila queue = new Fila();
		
		for (int i = 0; i < 20; i++) {
			Cliente c = new Cliente("Cliente " + i,
					randomIntegerNumber(50, 20), 
					randomFloatNumber(5.00, 100.00)
			);
	
			queue.insert(c);
		}
		
		OperacaoController op = new OperacaoController();
	
		op.caixa(queue);
	}
	
	public static int randomIntegerNumber(int max, int min) {
		return (int) (Math.random() * (max - min) + min);
	}

	public static float randomFloatNumber(double d, double e) {
		return (float) (Math.random() * (d - e) + e);
	}

}
