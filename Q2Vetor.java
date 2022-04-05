package Familia51;

import java.util.Scanner;

public class Q2Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numero = new int [6];
		int contaPar=0,contaImpar=0,x,somaPar=0,somaImpar=0,num;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			if(num % 2 == 0)
			{
				somaPar += num;
				contaPar++;		
				
			}
			else
			{
				somaImpar += num;
				contaImpar++;
				
			}
			
			
		}
	
		
	System.out.println("\nVocê digitou "+contaPar+ " números pares!");
	System.out.println("\nA soma dos números pares é "+somaPar);
	System.out.println("\nVocê digitou "+contaImpar+ " números impares!");
	System.out.println("\nA soma dos números ímpares é "+somaImpar);
	}

}
