package ar.com.test1.clases;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola a todos");
		Main m = new Main();
		m.sumarDosNumeros(15, 15);
		int resultado = m.sumarNumeros(350, 489);
		System.out.println("resultado, "+resultado);
		Operacion sum = new Operacion(1250,27000);
		System.out.println("llamo a mi metodo suma "+sum.calculadora());
		
	}
	/**
	 * Este metodo sumo dos numeros
	 * @param numero1
	 * @param numero2
	 */
	public void sumarDosNumeros(int numero1, int numero2){
		int suma = 0;
		suma = numero1 + numero2;
		System.out.println("resultado, "+suma);
	}
	public int sumarNumeros(int numero1, int numero2){
		int suma = 0;
		suma = numero1 + numero2;
		return suma;
	}
}
