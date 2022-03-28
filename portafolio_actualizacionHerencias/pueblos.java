/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario mejía
 */
public class pueblos {
    protected String nombre;
    protected int dificultad;
    protected int cantEnemigos;
    
    public void setNombre (String _nombre)
    {
        this.nombre = _nombre;
    }
    
    public String getNombre(){
     return this.nombre;
    }
    
    public void setDificultad(int _Dificultad){
       this.dificultad = _Dificultad;
    }
    
    public int getDificuldad(){
        return this.dificultad;
    }
    
    public void setCantEnemigos(int _cantEnemigos){
        this.cantEnemigos =_cantEnemigos;
    }
    
    public int getPoder(){
        return this.cantEnemigos;
    }
    
    public void creaPueblo (String _nombre,int _dificultad, int _cantEnemigos)
    {
        nombre =_nombre;
        dificultad = _dificultad;
        cantEnemigos =_cantEnemigos;
        /*
        el metodo crearPueblo, sera el metodo que utilizaremos para, como su nobre lo indica
        crear nuevos objetos del tipo pueblos.
        */
    }
    
    /*se eliminara el metodo pueblos para crear clases hijos pueblos
    esto con el fin de poder manejar mejor cada pueblo y poder detallar los objetos y enemigos 
    que estaran dentro de este pueblo*/
   public void Pueblos (){
       
        
        pueblos Pueblo1 = new pueblos();
        pueblos Pueblo2 = new pueblos();
        pueblos Pueblo3 = new pueblos();
        pueblos Pueblo4 = new pueblos();
        Pueblo1.creaPueblo("pueblo 1", 1, 5);
        Pueblo2.creaPueblo("pueblo 2", 2, 7);
        Pueblo3.creaPueblo("pueblo 3", 2, 5);
        Pueblo4.creaPueblo("pueblo 4", 5, 9);
   }
    /*el metodo Pelea creara los diferentes enemigos que estaran presentes en los pueblos al igual que los jefes
   haciendo uso de los metodos creadores pertenecientes a cada una de las clases correspondientes*/
   public void pelea(){
       Enemigos enemigo1 = new Enemigos ();
       Jefe jefe1 = new Jefe();
       enemigo1.crearEnemigo("Ladron", 15, 5, 1, 2);
       jefe1.crearJefe("Paco", 35, 5, 1, 3, 0.02);
   }
    
}
