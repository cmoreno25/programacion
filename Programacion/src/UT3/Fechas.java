/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author cmoreno
 *
 */
public class Fechas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salir=1;
		Scanner sc = new Scanner(System.in);
		int dia;
		int mes;
		int a�o;
		while (salir!=0) {
			System.out.print("Introduzca d�a: ");
			dia=sc.nextInt();
			 System.out.print("Introduzca mes: ");
			 mes=sc.nextInt();
			 System.out.print("Introduzca a�o: ");
			 a�o=sc.nextInt();
			 if (dia >= 1 && dia <=30)
				 if (mes >= 1 && mes <= 12 && 1000<a�o && a�o<3000)
	
	        
			 System.out.println(a�o + "/" + mes + "/" + dia);
		 	 System.out.println("Si desea salir presione (0) sino pulse (1) ");
		 	 
		 	 
	}

}
}