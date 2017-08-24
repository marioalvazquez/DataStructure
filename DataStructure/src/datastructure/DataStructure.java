/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author tec
 */
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array [] = {1,2,31,4,25,1};
        PrintMayMin(array);
    }
    
    public static void PrintMayMin(int[] a){
        int may = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
          if (may < a[i]) may = a[i];
          if (min > a[i]) min = a[i];
        };
        
        System.out.println("El número mayor es: " + may);
        System.out.println("El número mayor es: " + min);

    }
    }
