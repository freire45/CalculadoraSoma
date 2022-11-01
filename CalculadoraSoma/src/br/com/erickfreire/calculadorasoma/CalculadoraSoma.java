package br.com.erickfreire.calculadorasoma;

import javax.swing.JOptionPane;

public class CalculadoraSoma {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int soma;
		
		JOptionPane.showMessageDialog(null, "Calculadora de Soma!");
		
		String num1 = JOptionPane.showInputDialog(null," Digite o primeiro valor:");
		
		numero1 = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog(null," Digite o segundo valor:");
		
		numero2 = Integer.parseInt(num2);
		
		soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "Resultado: " + soma );

	}

}
