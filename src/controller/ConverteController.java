package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class ConverteController {
	
	Pilha p = new Pilha();
	
	public String decToBin(int decimal) {
		while (decimal > 0) {
			p.push(decimal % 2);
			decimal /= 2;
		}
		StringBuffer stringBuffer = new StringBuffer();
		
		while (!p.isEmpty()) {
			try {
				stringBuffer.append(p.pop());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return stringBuffer.toString();
	}
}
