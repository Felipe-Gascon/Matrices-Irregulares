package ejemplo3;

import java.util.Scanner;
public class MatrizIrregular3 {
   Scanner sc= new Scanner(System.in);
    private String[] nombres;
    private int[][] dias;
    
    public void cargar()
    {
       
        nombres=new String[3];
        dias=new int[3][];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese el nombre del empleado:");
            nombres[f]=sc.next();
            System.out.print("Cuantas d�as falt� el empleado:");
            int faltas=sc.nextInt();
            dias[f]=new int[faltas];            
            for(int c=0;c<dias[f].length;c++) {
                System.out.print("Ingrese nro de d�a:");
                dias[f][c]=sc.nextInt();
            }
        }
    }
    
    public void inasistencias() 
    {
        for(int f=0;f<nombres.length;f++)
        {
            System.out.println(nombres[f] + " falt� " + dias[f].length + " d�as");
        }
    }
    
    public void empleadoMenosFaltas() 
    {
        int faltas=dias[0].length;
        String nom=nombres[0];
        for(int f=1;f<dias.length;f++) 
        {
            if (dias[f].length<faltas) 
            {
                faltas=dias[f].length;
                nom=nombres[f];
            }
        }
        System.out.println("El empleado que falt� menos es "+nom+" con "+faltas+" faltas.");
    }
    
    public static void main(String[] ar) {
        MatrizIrregular3 ma=new MatrizIrregular3();
        ma.cargar();
        ma.inasistencias();
        ma.empleadoMenosFaltas();
    }
}