/**
 * 
 */
package UT3;

/**
 * @author cmoreno
 *
 */
public class Condicion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Uso de if - else iff
				//escribir si un numero es par o impar
				int numero = 23;
				if(numero%2 == 0){
					System.out.println("Es par");
			} else
				System.out.println("Es impar");
				
				//Indicar si es multiplo de 10, de 2, de 5 o ninguno de estos
				if(numero%10 == 0){
					System.out.println("Es multiplo de 10");
				}else if(numero%2 == 0) {
					System.out.println("Es multiplo de 2");
				}else if(numero%3 == 0) {
						System.out.println("Es multiplo de 5");
			} else
				System.out.println("Ningun caso de estos");
				
				//Uso de distintos operadores logicos (<, >, ==, !=, &&)
				
				if (numero%2 == 0 && numero%3 == 0 && numero%10 !=0) {
					System.out.println("Multiplo de 2 y 3, pero no de 10");
					
				}else
					System.out.println("No cumple las condiciones");
			}
		       
		}