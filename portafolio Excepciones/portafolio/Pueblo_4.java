/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario
 */
public class Pueblo_4 extends pueblos{
    protected int visitas = 0;
    
    protected void setVisitas (int _visitas){
        this.visitas = _visitas;
        
    } 
    
    protected int getVisitas(){
    return this.visitas;
}
    
    
 public static void AventuraPueblo4 (){
     /*en un inicio creamos los diferentes personajes que seran utilizados por cada pueblo, en este caso
     se crean 5 enemigos y 1 jefe.*/
     Enemigos enemigo1P4= new Enemigos();
     Enemigos enemigo2P4= new Enemigos();
     Enemigos enemigo3P4= new Enemigos();
     Enemigos enemigo4P4= new Enemigos();
     Enemigos enemigo5P4= new Enemigos();
     Enemigos enemigo6P4= new Enemigos();
     Enemigos enemigo7P4= new Enemigos();
     Enemigos enemigo8P4= new Enemigos();
     Enemigos enemigo9P4= new Enemigos();
     Jefe jefe4P4 = new Jefe();
     
     enemigo1P4.crearEnemigo("¿mutante raro?", 10,5,1,1);
     enemigo2P4.crearEnemigo("¿mutante raro?", 12,5,1,1);
     enemigo3P4.crearEnemigo("¿mutante raro?", 15,5,1,1);
     enemigo4P4.crearEnemigo("¿mutante raro?", 20,5,1,1);
     enemigo5P4.crearEnemigo("¿mutante raro?", 25,5,1,1);
     enemigo6P4.crearEnemigo("¿mutante raro?", 15,5,1,1);
     enemigo7P4.crearEnemigo("¿mutante raro?", 20,5,1,1);
     enemigo8P4.crearEnemigo("¿mutante raro?", 25,5,1,1);
     enemigo9P4.crearEnemigo("¿qué se supone que es eso?", 35,8,1,1);
     jefe4P4.crearJefe("Mutante supremo", 50, 15, 1, 1, 0.05);
     
     //muestra los datos de los enemigos
     System.out.println("te has encontrado con estos enemigos: ");
     enemigo1P4.muestraDatosEnemigo();
     enemigo2P4.muestraDatosEnemigo();
     enemigo3P4.muestraDatosEnemigo();
     enemigo4P4.muestraDatosEnemigo();
     enemigo5P4.muestraDatosEnemigo();
     enemigo6P4.muestraDatosEnemigo();
     enemigo7P4.muestraDatosEnemigo();
     enemigo8P4.muestraDatosEnemigo();
     enemigo9P4.muestraDatosEnemigo();
     jefe4P4.muestraDatosJefe();
     
    }   
    
}
