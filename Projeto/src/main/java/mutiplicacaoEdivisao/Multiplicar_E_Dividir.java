package mutiplicacaoEdivisao;

import javax.swing.JOptionPane;

public class Multiplicar_E_Dividir {

	private int valor1;
	private int valor2;
	

	public Multiplicar_E_Dividir() {

	}

	public Multiplicar_E_Dividir(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public int getValor1() {
		return valor1;
	}

	public  void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public  int getValor2() {
		return valor2;
	}

	public  void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	//public void multiplicar() {
	//	valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
	//	valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
	//	System.out.println("O valor da multiplicação é: " + (valor1 * valor2));
	//}
	
	public void dividir() {
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
		System.out.println("O valor da divisão é: " + (valor1 / valor2));
	}
}
