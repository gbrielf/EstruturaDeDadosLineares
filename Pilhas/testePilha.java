/*
 * Created on 01/09/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

import java.util.Scanner;

/**
 * @author Robinson
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class testePilha {

	public static void main(String[] args) {		
		Integer[] b = new Integer[1];

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a capacidade (tamanho inicial da pilha):");
		int capacidade = sc.nextInt();
		System.out.println("Digite o fator de crescimento (como ela cresce, por incremento ou dobrando):");
		int crescimento = sc.nextInt();

		PilhaArray pp = new PilhaArray(capacidade,crescimento);
		System.out.println("inserindo");
		long inicio = System.currentTimeMillis();
		// length é igual a quantidade elementos que você quer por na pilha
		for(int f=0;f<10000;f++){
		  System.out.println(f);		  
		  pp.push(new Integer(f));
		}
		long fim = System.currentTimeMillis();

		long tempo = fim - inicio;
		System.out.println(tempo);
		System.out.println(pp);		  
	}
}
