package ejerciciodelCurso.proyectoEjerciciodelCurso;

public class CalculosMatematicos {

	public static int potencia(int base, int exponente) {

		int resul = 1;
		if (exponente > 0)
			resul = base * potencia(base, exponente - 1);
		return resul;
	}

	public static boolean esPrimo(int numero) {

		boolean primo = true;
		int divisor = 3;
		if(numero !=2 && numero%2==0)
			primo=false;
		while(primo && divisor< numero/2) {
			if(numero % divisor==0)
				primo = false;
			divisor+=2;
		}
		return primo;
	}
	
	public static int Factorial(int numero) {
		int factorial=1;
		for(int i =1;i<=numero;i++) {
			factorial = factorial * i;
		}
		return factorial;	
		
	}
	


}