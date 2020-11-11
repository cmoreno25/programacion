/**
 * 
 */
import java.util.Scanner;

/**
 * @author konrad
 *
 */
public class ejercicio_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nota; 

         

	        System.out.println("Escribe la nota:"); 
	        System.out.println("EJERCICIO 7 MODIFICO EL CODIGO Y LO VUELVO A SUBIR A GIT HUB EN EL PROYECTO COMPARTIDO POR LUIS Y CARLOS"); 

	        Scanner sn= new Scanner(System.in); 

	        nota= sn.nextInt(); 

	         

	        if(nota>0 && nota<11) { 

	            if(nota>=0 && nota<5) { 

	            System.out.println("Insuficiente"); 

	        }else { 

	            if(nota==5) { 

	                System.out.println("Suficiente"); 

	            }else { 

	                if(nota==6) { 

	                    System.out.println("bien"); 

	                }else { 

	                    if(nota<9) { 

	                        System.out.println("notable"); 

	                    }else { 

	                        System.out.println("sobresaliente"); 

	                         

	                        } 

	                    } 

	                } 

	            } 

	        }else { 

	            System.out.println("ERROR"); 

	        } 

	}

}
