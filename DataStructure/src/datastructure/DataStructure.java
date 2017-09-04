/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author tec
 */
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GetFash();
    }
    
    public static void GetMean()
    {
        Random random = new Random();
        int begining = 100;
        int end = 999;
        int mean;
        int total = 0;
        int [] array = new int[100];
                
        for (int i = 0; i < 100; i++) {
            int temp = (random.nextInt(end - begining)+ begining);
            array[i] = temp;
            if (i == 0) System.out.println("Grupo 1:");
            if (i == 25) System.out.println("\nGrupo 2:");
            if (i == 50) System.out.println("\nGrupo 3:");
            if (i == 75) System.out.println("\nGrupo 4:");
            System.out.print(temp + ", ");
            total += temp;
        }
        System.out.println("\nPromedio: " + total/100);
    }
    
    public static void GetFash(){
      Random random = new Random();
        int begining = 100;
        int end = 999;
        int mean;
        int total = 0;
        int [] array = new int[100];
                
        for (int i = 0; i < 100; i++) {
            int temp = (random.nextInt(end - begining)+ begining);
            array[i] = temp;
            if (i == 0) System.out.println("Grupo 1:");
            if (i == 25) System.out.println("\nGrupo 2:");
            if (i == 50) System.out.println("\nGrupo 3:");
            if (i == 75) System.out.println("\nGrupo 4:");
            System.out.print(temp + ", ");
            total += temp;
        }
        
        Arrays.sort(array);
        
        int mean1 = 0;
        int mean2 = 0;
        int fash1;
        int fash2;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (i <= 99) {
                if (temp == array[i+1]) {
                    fash1 = temp;
                    mean1++;
                }
                else{
                    fash2 = array[i+1];
                    mean2++;
                }
                }
            }
        }
        
    
    
    
    
    public static void Vectors()
    {
        Vector v = new Vector();
        String output = "El vector v:\n" + howMany(v);
        
        v.add("Rojo");
        v.add("Verde");
        v.add("Rosa");
        v.insertElementAt("Azul", 0);
        v.insertElementAt("Mango", 1);
        v.insertElementAt("Amarillo", 3);
        
        output += "\n v.toString(): " + v.toString();
        v.remove("Mango");
        output += "\n Después de borrar Mango " + v.toString();
        output += "\n El vector v:\n" + howMany(v);
        JOptionPane.showMessageDialog(null, output, "Clase Vector", JOptionPane.PLAIN_MESSAGE);
    }
    
    private static String howMany(Vector v) {
        if (!v.isEmpty()) {
            return "tiene una capacidad de " + v.capacity() + "\n" + 
                    "y están ocupados" + v.size();
        }
        return "No tiene elementos";
    }
    
    
    
    public static void PrintRandom()
    {
        final int begining = 12;
        final int end = 25;
        
        Random random = new Random();
        
        for (int i = begining; i < end; i++) {
            System.out.println("Número Aleatorio: " +
                    (random.nextInt(end - begining)+ begining));
        }
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
    public static void SumOfIntegers()
    {
        String firstNumber;
        String secondNumber;
        int total;
        
        firstNumber = JOptionPane.showInputDialog("Teclee el primer número");
        
        secondNumber = JOptionPane.showInputDialog("Teclee el segundo número");
        
        total = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        
        JOptionPane.showMessageDialog(null, "La suma es: " + total, "Resultados", JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
    }
    
    public static void PrintData()
    {
        Scanner input = new Scanner(System.in);
        
        String Message;
        int Integer;
        double Decimal;
        
        System.out.println("Introduce una cadena de caracteres:");
        Message = input.nextLine();
        
        System.out.println("Introduce un número entero:");
        Integer = input.nextInt();
        
        System.out.println("Introduce un número decimal:");
        Decimal = input.nextDouble();
        
        System.out.println("Los datos ingresados son los siguientes:\n"
        + "Mensaje: " + Message + "\n"
        + "Entero: " + Integer + "\n"
        + "Decimal: " + Decimal + "\n"
        );
    }
   
    public static void MultidimensionalLength()
    {
        float floatings [][] = {
            {5.5f, 8.1f, 9.5f,4.2f},
            {6.9f, 4.4f, -7.2f},
            {10.5f, -4.7f, 9.9f}
        };
        for (int i = 0; i < floatings.length; i++)
        {
            System.out.println("floatings[" + i + "].length = " + floatings[i].length);
        }
    }
    
    public static void MaxMin(int[] a)
    {
        int may = a[0], men = a[0];
        for (int i = 0; i < a.length; i++) {
            may = (a[i] > may) ? a[i] : may;
            men = (a[i] < men) ? a[i] : men;
        }   
        System.out.println("El número mayor es: " + may);
        System.out.println("El número menor es: " + men);
    }
    
}
