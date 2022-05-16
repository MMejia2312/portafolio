/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario
 */
public class Pueblo_1 extends pueblos {
    protected int visitas = 0;
    //la variable "visitas" nos servira para saber si el jefe de este pueblo ya fue vencido para asi no volver
    // a crearlo si se vuelve a visitar el pueblo.
    
    
    protected void setVisitas (int _visitas){
        this.visitas = _visitas;
        
    } 
    
    protected int getVisitas(){
    return this.visitas;
}
    /*el metodo pelea, como su nombre lo indica sera utilizado para realizar los diferentes combates
    que tendran lugar en los pueblos (el metodo podria ser movido a la clase padre "pueblos")*/
    public static void pelea(){
        
    }
    
 public static void AventuraPueblo1 (){
     /*en un inicio creamos los diferentes personajes que seran utilizados por cada pueblo, en este caso
     se crean 5 enemigos y 1 jefe.*/
     Enemigos enemigo1P1= new Enemigos();
     Enemigos enemigo2P1= new Enemigos();
     Enemigos enemigo3P1= new Enemigos();
     Enemigos enemigo4P1= new Enemigos();
     Enemigos enemigo5P1= new Enemigos();
     Jefe jefe1P1 = new Jefe();
     
     //la vida de los ladrones va aumentando en evidencia de la dificultad de cada uno.
     enemigo1P1.crearEnemigo("Ladron", 10,5,1,1);
     enemigo2P1.crearEnemigo("Ladron", 12,5,1,1);
     enemigo3P1.crearEnemigo("Ladron", 15,5,1,1);
     enemigo4P1.crearEnemigo("Ladron", 20,5,1,1);
     enemigo5P1.crearEnemigo("Ladron", 25,5,1,1);
     jefe1P1.crearJefe("Lider de los Ladrones", 30, 10, 1, 1, 0.02);
     System.out.println("te has encontrado con estos enemigos: ");
     enemigo1P1.muestraDatosEnemigo();
     enemigo2P1.muestraDatosEnemigo();
     enemigo3P1.muestraDatosEnemigo();
     enemigo4P1.muestraDatosEnemigo();
     enemigo5P1.muestraDatosEnemigo();
     jefe1P1.muestraDatosJefe();
     
}   
    
}
