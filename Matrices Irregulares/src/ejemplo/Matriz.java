package ejemplo;

import java.util.Scanner;
//Confeccionaremos un programa 
//que permita crear una matriz irregular
//y luego imprimir la matriz en forma completa.
public class Matriz {
	Scanner sc= new Scanner (System.in);
	private int mat[][];

	public void cargar()
	{
		System.out.println("Cuantas filas tiene la matriz: ");
		int filas=sc.nextInt();
		mat=new int [filas][];
		for(int f=0;f<mat.length;f++)
		{
			System.out.println("Cuantos elementos tiene la fila "+f+" :");
			int elementos=sc.nextInt();
			mat[f]=new int [elementos];
			for(int c=0;c<mat[f].length;c++)
			{
				System.out.println("Ingrese componente:");
				mat[f][c]=sc.nextInt();
			}	
		
		}
	}
		
		public void imprimir()
		{
			for (int f=0;f<mat.length;f++)
			{
				for(int c=0;c<mat[f].length;c++)
				{
					System.out.print(mat[f][c]+" ");
				}
				System.out.println();
			}
		}
	
	
	
	


	public static void main(String[] args) 
	{
		Matriz ma = new Matriz();
		ma.cargar();
		ma.imprimir();

	}

}
