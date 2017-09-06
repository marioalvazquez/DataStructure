/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author mario.vazquez
 */
public class ColaCircular {
    public static int front;
    
    public static int end;
    
    public static int err;
    
    public static String[] elements;
    
    public static int MAX_ELEM;

    private static int next(int end) {
        return (end + 1) % MAX_ELEM;
    }

    private static boolean ColaFull() {
        return front == next(next(end));
    }
    
    public ColaCircular(int maxElem){
        front = 0;
        MAX_ELEM = maxElem;
        end = MAX_ELEM - 1;
        elements = new String[MAX_ELEM];
        err = 0;
    }
    
    public static boolean ColaEmpty(){
        return front == next(end);
    }
    
    public int getErr(){
        return err;
    }
    
    public void PrintAll(){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != "") {
                System.out.print(elements[i] + " ,");
            }
        }
        System.out.println("");
    }
    
    public void Insert(String element){
        if (!ColaFull()) {
            end = next(end);
            elements[end] = element;
        }
        else{
            System.out.println("Cola llena");
            err = 1;
        }
    }
    
    public String Delete(){
        String temp;
        if (!ColaEmpty()) {
            temp = elements[front];
            front = next(front);
            return temp;
        }
        else{
            System.out.println("Cola vacía");
            err = 2;
            return "";
        }
    }
    
    
}
