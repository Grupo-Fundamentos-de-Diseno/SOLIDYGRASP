package principiossolid;

//PRINCIPIO ABIERTO / CERRADO
/*Para ejemplificar este principio, se crea una clase televisor que hereda
/los métodos de una clase abstracta y se crean varios objetos que implementan 
/dichos métodos, adicional una función para ver inventarios*/
public class AbiertoCerrado {
    public static void main(String[] args) {
        Televisor inventarioTV[] = new Televisor[3];
        inventarioTV[0] = new Televisor("LG", 10);
        inventarioTV[1] = new Televisor("Challenger", 20);
        inventarioTV[2] = new Televisor("Sony", 18);  
        
        imprimirInventario(inventarioTV);
    }
    /*La funcion para imprimir las existencias de inventario no se modifica
    /independientemente de cuantos productos nuevos se agreguen al arreglo*/
    static void imprimirInventario(Televisor[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i].marca() + " ");
            System.out.println(array[i].existenciasAlmacen() + " Unds");
        }
    }
}
abstract class Electrodomesticos {
    abstract String marca();
    abstract int existenciasAlmacen();
}
    
class Televisor extends Electrodomesticos {
    private String marca;
    private int existencias;
    public Televisor(String marca, int existencias){
        this.marca = marca;
        this.existencias = existencias;
    }
    @Override
    String marca(){
        return marca;
    }
    @Override
    int existenciasAlmacen(){
        return existencias;
    }
}   
