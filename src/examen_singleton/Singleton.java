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
public class Singleton {
    //atributos
    private String nombre;
    private static Singleton Singleton;

// El constructor es privado, no permite que se genere un constructor por defecto.
    private Singleton(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }
    
//método para instanciar, devuelve un objeto, en este caso 'Singleton'.
    public static Singleton getSingletonInstance(String nombre) {
        if (Singleton == null){
            Singleton = new Singleton(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase Singleton");
        }
        
        return Singleton;
    }
    
    
// metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Singleton getSingleton() {
        return Singleton;
    }

    public static void setSingleton(Singleton Singleton) {
        Singleton.Singleton = Singleton;
    }

}



