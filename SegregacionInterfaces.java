package principiossolid;

public class SegregacionInterfaces {
   
    public static void main(String[] args) {
       
    }  
}

//PRINCIPIO DE SEGREGACIÓN DE INTERFACES
/*
/En este ejemplo se crean 3 interfaces con distintas funciones con el fin que,
/cada clase creada para un vehiculo nuevo, pueda implementar la funcionalidad
/de una o varias interfaces sin tener que contratar funciones que no utilizará
*/
interface Ivehiculo {
    void encender();
    void apagar();        
}
interface IvehiculoAereo {
    void volar();
    void aterrizar();
}      
interface IvehiculoAcuatico {  
    void flotar();
    void navegar();
}
    
class Barco implements Ivehiculo, IvehiculoAcuatico {
    @Override
    public void encender(){System.out.println("Vehiculo encendido");}
    @Override
    public void apagar(){System.out.println("Vehiculo apagado");}
    @Override
    public void flotar(){System.out.println("El vehiculo esta flotando");}
    @Override
    public void navegar(){System.out.println("El vehiculo esta en movimiento");}
        
}
    
class Helicoptero implements Ivehiculo, IvehiculoAereo {
    @Override
    public void encender(){System.out.println("Vehiculo encendido");}
    @Override
    public void apagar(){System.out.println("Vehiculo apagado");}
    @Override
    public void volar(){System.out.println("El vehiculo esta volando");}
    @Override
    public void aterrizar(){System.out.println("El vehiculo aterrizó");}
}
