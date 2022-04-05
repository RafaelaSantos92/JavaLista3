package Familia51;

public class Q1Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] A = {1,0,5,-2,-5,7};		
		int i,soma;
		soma = A[0]+A[1]+A[5];
		A[3]=100;
		
		for(i=0;i<6;i++)
		{
			System.out.printf("\nA[%d]",A[i]);
		}
		System.out.println("\nO resultado da soma é: "+soma);
		
	}

}
