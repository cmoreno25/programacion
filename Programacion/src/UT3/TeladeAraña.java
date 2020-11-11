/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author daigo
 *
 */
public class TeladeAraña {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Que peso soporta la tela de araña? :");
        int peso = sc.nextInt();
        System.out.println("Peso del elefante numero 1: ");
        int elefante1 = sc.nextInt();
        System.out.println("Peso del elefante numero 2: ");
        int elefante2 = sc.nextInt();
        System.out.println("Peso del elefante numero 3: ");
        int elefante3 = sc.nextInt();
        System.out.println("Peso del elefante numero 4: ");
        int elefante4 = sc.nextInt();
         for(int i = 0; i < peso; i++) {
        	if(peso<elefante1+elefante2+elefante3+elefante4) {
        		System.out.println("Y se rompió!");
        		break;
        } if(peso>elefante1+elefante2+elefante3+elefante4) {
        	System.out.println("La tela de araña aun aguanta!");
        	break;
        	
        }
       
         } 
        
	}
	
}




