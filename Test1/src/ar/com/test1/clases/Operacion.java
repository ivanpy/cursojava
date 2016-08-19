package ar.com.test1.clases;

public class Operacion {

	public int numero1;
	public int numero2;
	public String tipoOperacion;



	public Operacion(int numero1, int numero2, String tipoOperacion){
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.tipoOperacion = tipoOperacion;

	}

	public Operacion(int numero1, int numero2){
		this.numero1 = numero1;
		this.numero2 = numero2;		

	}
	
	public int calculadora(){
		int suma = 0;
		suma = this.numero1 + this.numero2;
		return suma;

	}

}