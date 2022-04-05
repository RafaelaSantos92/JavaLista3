package Familia51;

import java.util.Scanner;

public class Q3Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]numeros = new int [3][3];
		int contaNum=0,linha,coluna;
		
		Scanner leia = new Scanner (System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um número: ");
				numeros[linha][coluna]= leia.nextInt();
				if (numeros[linha][coluna] > 10)
				{
					contaNum++;
				}
				
			}
			
		}
		System.out.println("\nA matriz possui "+contaNum+ " número[s] maior[es] que 10!");

	}

}
