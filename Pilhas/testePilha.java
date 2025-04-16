/*
 * Created on 01/09/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Robinson
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class testePilha {

	public static void main(String[] args) {		
		Integer[] b = new Integer[1];
		PilhaArray pp = new PilhaArray(10,10);
		System.out.println("inserindo");
		int inicio = System.currentTimeMillis());
		for(int f=0;f<10;f++){
		  System.out.println(f);		  
		  pp.push(new Integer(f));
		}
		System.out.println("retirando");
		for(int f=0;f<10;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.pop());
		}
		int fim = System.currentTimeMillis());

		int tempo = inicio - fim;
		System.out.println(tempo);
		System.out.println(pp);		  
	}
}
