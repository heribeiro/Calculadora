package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	Scanner scan = new Scanner(System.in);
	public void init() {
		
		
		System.out.println("Informe o cálculo desejado!");
		
		String operacao[] = new String[3];
		String txt = scan.nextLine();
		operacao= txt.split(" ");
		float valor1 = Float.parseFloat(operacao[0]);
		float valor2 = Float.parseFloat(operacao[2]);
		
	
		switch (operacao[1]) {
		case "+": 
			System.out.println(txt + " = " + this.adicao(valor1,valor2));
			break;
			
		case "-": 
			System.out.println(txt + " = " + this.subtracao(valor1,valor2));
			break;
		
		case "*": 
			System.out.println(txt + " = " + this.multiplicacao(valor1,valor2));
			break;
		
		case "/": 
			System.out.println(txt + " = " + this.divisao(valor1,valor2));
			break;
			
		default:
			System.out.println("operção inexistente");
			break;
		}
			
}
		
	public float adicao(float v1, float v2) {
		return v1 + v2;
	}
	
	public float subtracao(float v1, float v2) {
		return v1 - v2;
	}
	
	public float multiplicacao(float v1, float v2) {
		return v1 * v2;
	}
	
	public float divisao(float v1, float v2) {
		return v1 / v2;
	}

}



