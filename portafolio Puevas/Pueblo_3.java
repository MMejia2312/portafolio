/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Pueblo_3 extends pueblos {
    protected int visitas = 0;
    
     protected void setVisitas (int _visitas){
        this.visitas = _visitas;
    } 
    
    protected int getVisitas(){
    return this.visitas;
    }
    public static void AventuraPueblo3 (){
     /*en un inicio creamos los diferentes personajes que seran utilizados por cada pueblo, en este caso
     se crean 5 enemigos y 1 jefe.*/
     Enemigos enemigo1P3= new Enemigos();
     Enemigos enemigo2P3= new Enemigos();
     Enemigos enemigo3P3= new Enemigos();
     Enemigos enemigo4P3= new Enemigos();
     Enemigos enemigo5P3= new Enemigos();
     Jefe jefe3P3 = new Jefe();
     
     enemigo1P3.crearEnemigo("Polocia corrupto", 10,5,1,1);
     enemigo2P3.crearEnemigo("Polocia corrupto", 12,5,1,1);
     enemigo3P3.crearEnemigo("Polocia corrupto", 15,5,1,1);
     enemigo4P3.crearEnemigo("Polocia corrupto", 20,5,1,1);
     enemigo5P3.crearEnemigo("Polocia corrupto", 25,5,1,1);
     jefe3P3.crearJefe("Politico Corrupto", 30, 15, 1, 1, 0.02);
     System.out.println("te has encontrado con estos enemigos: ");
     enemigo1P3.muestraDatosEnemigo();
     enemigo2P3.muestraDatosEnemigo();
     enemigo3P3.muestraDatosEnemigo();
     enemigo4P3.muestraDatosEnemigo();
     enemigo5P3.muestraDatosEnemigo();
     System.out.println("para facilitarte las cosas, lus ataques seran automaticos hasta que termines con algun enemigo");
     
     while(enemigo1P3.vivo() == true){
         enemigo1P3.golpe(10);
     }
     
     Scanner escapamos = new Scanner(System.in);
     char escapamos1;
     System.out.println("¿Quieres seguir atacando?"); 
     System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
     escapamos1 = escapamos.next().charAt(0);
      if (escapamos1 == 'S' || escapamos1 == 's' ){
          System.out.println("Perfecto continuemos");
          while(enemigo2P3.vivo() == true){
          enemigo2P3.golpe(10);
          
          System.out.println("¿Quieres seguir atacando?"); 
          System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
          escapamos1 = escapamos.next().charAt(0);
          if (escapamos1 == 'S' || escapamos1 == 's' ){
              System.out.println("Perfecto continuemos");
            while(enemigo3P3.vivo() == true){
            enemigo3P3.golpe(10);
            }
              System.out.println("¿Quieres seguir atacando?"); 
              System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
              escapamos1 = escapamos.next().charAt(0);
                if (escapamos1 == 'S' || escapamos1 == 's' ){
                System.out.println("Perfecto continuemos");
                     while(enemigo4P3.vivo() == true){
                     enemigo4P3.golpe(10);
                    }
                        System.out.println("¿Quieres seguir atacando?"); 
                        System.out.println("Presiona 's' para continuar o cualquier letra para escapar");
                        escapamos1 = escapamos.next().charAt(0);
                            if (escapamos1 == 'S' || escapamos1 == 's' ){
                             System.out.println("Perfecto continuemos");
                                while(enemigo5P3.vivo() == true){
                                 enemigo5P3.golpe(10);
                                }
                                System.out.println("Ha aparecido un Jefe, no podemos hecharnos para atras.");
                                jefe3P3.muestraDatosJefe();
                                System.out.println("Toma esto, te ayudara a darle pelea.");
                                System.out.println("Ahora rienes un poder de 25.");
                                while (jefe3P3.vivo() == true){
                                    jefe3P3.golpe(25);
                                }

                            }else{
                            System.out.println("Hora de la retirada");
                            }
                        
                 }else{
                 System.out.println("Hora de la retirada");
                }
          
            }else{
            System.out.println("Hora de la retirada");
            }
        }
      }else{
          System.out.println("Hora de la retirada");
      }
     
}   
    
    
}
