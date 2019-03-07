/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_singleton;

/**
 *
 * @author slorenzorodriguez
 */
public class Examen_SIngleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Singleton obx1 = Singleton.getSingletonInstance("Ricardo Moya");
        Singleton obx2 = Singleton.getSingletonInstance("Ramón Invarato");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(obx1.getNombre());
        System.out.println(obx2.getNombre());   
    }
    }
    

