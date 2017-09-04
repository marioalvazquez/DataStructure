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
//Initialize class
public class Pila {
    //Initialize static property which states the maximum number of elements that the battery can contain
    final static int MAX_ELEM = 100;
    
    //Stores and id to recognize error types
    private int error;
    
    //Property that will determine where the last element is
    static int top;
    
    //Array that will cover the battery core storage function
    static char[] element;
    
    //Initialize an empty battery
    public Pila(){
        error = 0;
        top = -1;
        element = new char[MAX_ELEM];
    }
    
    //Insert a new element of type char to the top of the battery
    public void insert(char d){
        //makes sure battery is not empty in order to add a new element
        if (!PilaFull()) {
            element[++top] = d;
        } else{ // In case it is full, will show an error message
            System.out.println("Battery full");
            error = 1;
        }
    }
    
    //Takes out and return the character at the very top of the pile if it has one, otherwise pirnts error message with empty character
    public char pop(){
        if (!PilaEmpty()) {
            return element[top--];
        }
        else{
            System.out.println("Battery empty");
            error = 2;
            return ' ';
        }
    }
    
    //Boolean method that will return true or false either if the battery is full of capacity or not
    public boolean PilaFull() {
        return top == MAX_ELEM -1;   
    }

    //Will return true is the top of the battery is set to index -1 which means it has not elements yet
    public boolean PilaEmpty() {
        return top == -1;
    }
    
    //Get the error registered if exists or 0 if there were no errors
    public int getErr(){
        return error;
    }
    
    
}
