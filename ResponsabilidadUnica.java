package principiossolid;

public class ResponsabilidadUnica {

    public static void main(String[] args) {
       
    }    
}    
   
//PRINCIPIO DE RESPONSABILIDAD ÚNICA    
/*
/Para el ejemplo, se crean 2 clases con un único propósito cada una.
/La primera contiene el atributo correspondiente al tipo de
/electrodomestico y la segunda, gestiona la base de datos para guardar,
/borrar y traer los diferentes tipos.
*/
class Electrodomestico {
        
    String tipo;
        
    Electrodomestico(String tipo){
        this.tipo = tipo;
    }
        
    String getTipoElectrodomestico(){
        return tipo;
    }        
}
    
class ElectrodomesticosBD {
        
    void guardarElectrodomesticoEnBD(Electrodomestico valor){}
        
    void eliminarElectrodomesticoEnBD(Electrodomestico valor){}
        
    void traerElectrodomesticoEnBD(Electrodomestico valor){}
    }

