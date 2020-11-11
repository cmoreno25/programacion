/**
 * 
 */
package UT3;

import java.util.Scanner;

/**
 * @author carlos
 *
 */
public class Elefantes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Que peso soporta la tela de araña? :");
        int peso = sc.nextInt();
        int peso_actual = 0;
        boolean loop = true;
        while(loop){
            System.out.println("Peso del elefante numero 1: ");
            int elefante1 = sc.nextInt();
            System.out.println("Peso del elefante numero 2: ");
            int elefante2 = sc.nextInt();
            System.out.println("Peso del elefante numero 3: ");
            int elefante3 = sc.nextInt();
            System.out.println("Peso del elefante numero 4: ");
            int elefante4 = sc.nextInt();
            
            peso_actual = peso_actual + elefante1 + elefante2 + elefante3 + elefante4;
            if(peso < peso_actual) {
                System.out.println("Y se rompió!, Peso: " + peso_actual);
                break;
            }
            if(peso > peso_actual) {
                System.out.println("La tela de araña aun aguanta!, peso: "+peso_actual+" \n");
            }   
            
            System.out.println("Si desea volver a consultar la tela de araña presione 1 \n");
            int consultar = sc.nextInt();
            if(consultar != 1){
                break;
            }
            
        }
	}

}