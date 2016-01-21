package ejemplo2;

import java.util.Scanner;

public class Matriz1 {
	Scanner sc = new Scanner (System.in);
	int mat[][];

	public void cargar()
	{
		mat=new int [5][];
		for (int f=0;f<mat.length;f++)
		{
			mat[f]=new int[f+1];
			for(int c=0;c<mat[f].length;c++)
			{
				System.out.println("Ingrese Numero:");
				mat[f][c]=sc.nextInt();
			}
		}

	}

	public void Posicion()
	{
		int pos1,pos2;
		System.out.println("introduce una posic");
		pos1=sc.nextInt();
		System.out.println("introduce una posic");
		pos2=sc.nextInt();
		int result=0;

		if(pos1>mat.length)
		{
			System.out.println("No hay nada en la posicion "+pos1);
		}
		else
		{
			if(pos2>mat[pos1].length)
			{
				System.out.println("No hay nada en la posicion "+pos2);
			}
			else
			{
			
				result=mat[pos1][pos2];
				System.out.println("En "+pos1+","+pos2+" tenemos el valor "+result);
			}

		}



	}
	public void Imprimir()
	{
		for(int f=0;f<mat.length;f++)
		{
			for(int c=0; c<mat[f].length;c++)
			{
				System.out.print(mat[f][c]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Matriz1 ma= new Matriz1();
		ma.cargar();
		ma.Imprimir();
		ma.Posicion();

	}

}
