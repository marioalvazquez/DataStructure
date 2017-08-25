/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Random;
import java.util.Scanner;
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

    }public static void SumOfIntegers()
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
    }
