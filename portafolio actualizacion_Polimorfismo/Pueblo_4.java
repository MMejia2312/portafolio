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
     Enemigos enemigo1= new Enemigos();
     Enemigos enemigo2= new Enemigos();
     Enemigos enemigo3= new Enemigos();
     Enemigos enemigo4= new Enemigos();
     Enemigos enemigo5= new Enemigos();
     Enemigos enemigo6= new Enemigos();
     Enemigos enemigo7= new Enemigos();
     Enemigos enemigo8= new Enemigos();
     Enemigos enemigo9= new Enemigos();
     Jefe jefe4 = new Jefe();
     
     enemigo1.crearEnemigo("¿mutante raro?", 10,5,1,1);
     enemigo2.crearEnemigo("¿mutante raro?", 12,5,1,1);
     enemigo3.crearEnemigo("¿mutante raro?", 15,5,1,1);
     enemigo4.crearEnemigo("¿mutante raro?", 20,5,1,1);
     enemigo5.crearEnemigo("¿mutante raro?", 25,5,1,1);
     enemigo6.crearEnemigo("¿mutante raro?", 15,5,1,1);
     enemigo7.crearEnemigo("¿mutante raro?", 20,5,1,1);
     enemigo8.crearEnemigo("¿mutante raro?", 25,5,1,1);
     enemigo9.crearEnemigo("¿qué se supone que es eso?", 35,8,1,1);
     jefe4.crearJefe("Lider de los Forajidos", 50, 15, 1, 1, 0.05);
     
     //muestra los datos de los enemigos
     System.out.println("te has encontrado con estos enemigos: ");
     enemigo1.muestraDatos();
     enemigo2.muestraDatos();
     enemigo3.muestraDatos();
     enemigo4.muestraDatos();
     enemigo5.muestraDatos();
     enemigo6.muestraDatos();
     enemigo7.muestraDatos();
     enemigo8.muestraDatos();
     enemigo9.muestraDatos();
     jefe4.muestraDatos();
     
    }   
    
}
