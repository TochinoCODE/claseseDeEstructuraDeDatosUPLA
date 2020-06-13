//Anthony Joel Carhuachin Calixto 
package clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AplicaPila {
    static Scanner entrada = new Scanner(System.in);
    public static CPila Pila;
    public static void main (String [] args){
    menuPila();    
    }
    
    static void crearPila(){
        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño de la pila"));
        Pila = new CPila(tam);
        JOptionPane.showMessageDialog(null,"pila creada");
    }
    
    public static void menuPila(){
        int opcion;
        do{
            System.out.println("Menu de opciones");
            System.out.println("[1] Crear Pila");
            System.out.println("===========");
            System.out.println("[2] Ingresar Datos = [Apilar]");
            System.out.println("[3] Eliminar Datos = [Desapilar]");
            System.out.println("[4] Mostrar Pila");
            System.out.println("[5] Eliminar Pila");
            System.out.println("[6] Obtener el elemento cima de la pila");
            System.out.println("[7] Tamaño de la pila");
            System.out.println("[8] Ver si la pila no tiene elementos");
            System.out.println("[9] Ver si la pila esta llena");
            System.out.println("==============");
            System.out.println("[0] exit");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    crearPila();
                    break;
                case 2:
                    Pila.insertarPila();
                    break;
                case 3:
                    Pila.eliminarPila();
                    break;
                case 4:
                    Pila.mostrarPila();
                    break;
                case 5:
                    Pila.vaciarPila();
                    break;
                case 6:
                    Pila.elementoCima();
                    break;
                case 7:
                    System.out.println("El tamaño de la pila es : " + Pila.getTope());
                    break;
                case 8:
                    System.out.println(Pila.isPilasVacia());
                    break;
                case 9:
                    System.out.println(Pila.isPilaLlena());
                    break;
                case 0:
                    System.exit(0);
                    break;
                    //el null ahi va las caracteristicas de un objeto como coler tamaño etc;
                default: JOptionPane.showMessageDialog(null,"Ingrese un opcion correcta");
                            
                    
            }
        }while(opcion != 0);
    }
}
