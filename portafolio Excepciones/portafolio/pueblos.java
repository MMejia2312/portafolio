/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.portafolio;

/**
 *
 * @author mario mejía
 */
/*la clase pueblos se convirtio en una clase abstracta dado que se utilizaran las clases heredadas 
para poder manejar de forma mas especifica los diferentes pueblos que tenemos en este juego.*/
public abstract class pueblos {
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
    
    /*se elimino el metodo pueblos para crear clases hijos pueblos
    esto con el fin de poder manejar mejor cada pueblo y poder detallar los objetos y enemigos 
    que estaran dentro de este pueblo*/
  
}
