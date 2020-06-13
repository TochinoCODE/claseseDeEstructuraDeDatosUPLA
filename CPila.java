//Anthony Carhuachin Calixto 
package clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CPila {
    static Scanner entrada = new Scanner (System.in);
    //atributos
    int tope;
    int [] pila;
    int max;
    //contructor por defecto
    public CPila(){
        this.tope = 0;
        this.max = 100;
        this.pila = new int [this.max+1];
    }
    //sobrecarga del constructor
    public CPila(int MAX){
        this.tope = 0;
        this.max = MAX;
        this.pila = new int [this.max+1];
    }
    
    public int getTope(){
        return tope;
    }
    
    public void vaciarPila(){
        this.tope = 0;
    }
    
    public boolean isPilaLlena(){
      if (this.max == this.tope) return true;
      else                       return false;
    }
    
    public boolean isPilasVacia(){
        if (this.tope == 0) return true;
        else                return false;
    }
    
    public void insertarPila(){
        if (this.isPilaLlena())
            JOptionPane.showMessageDialog(null,"La pila esta llena");
        else {
           int item;
           item = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Elemnto a Ingresar"));
           this.pila[this.tope] = item;
           this.tope++;
           JOptionPane.showMessageDialog(null,"El Item "+ item + "Se inserto a la pila \n");
        }
    }
    
    public void eliminarPila(){
        if (this.isPilasVacia()) JOptionPane.showMessageDialog(null,"La pila esta vacia");
        else {
            int item = this.pila[this.tope - 1];
            this.tope--;
            JOptionPane.showMessageDialog(null,"El item "+ item + " Se elimino de  la pila");
        }
    }
    
    public void mostrarPila(){
        if (this.isPilasVacia()) JOptionPane.showMessageDialog(null,"La pila esta vacia no hay elemento que mostrar");
        else{
            System.out.println("\tElementos de la pila\n"
                    + "\t=====================");
            for (int i = 0; i< this.tope; i++){
                System.out.println(this.pila[i]+" <--");
            }
        } 
    }
    
    public void elementoCima(){
        
        System.out.println("EL elemento de la cima es : " + this.pila[tope-1]);
    }
}
