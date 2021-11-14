package principiossolid;

//PRINCIPIO DE SUBSTITUCIÓN DE LISKOV
/*
/En este ejemplo, se crea una superclase CuatroCaras que hereda sus atributos
/y métodos a la subclase Cuadrado. El principio de sustitución se cumple ya que
/se crea un objeto cuadrado instanciando la superclase sin ningún error.
*/
public class SubstitucionDeLiskov {

    public static void main(String[] args) {
       Cuadrado caja1 = new Cuadrado(5, 8);
        System.out.println(caja1.area());
        
        CuatroCaras caja2 = new Cuadrado(8, 7);
        System.out.println(caja2.area());
    }    
}
 
class CuatroCaras {
    private int ladoA;
    private int ladoB;    
    int area(){
        return ladoA * ladoB;
    }
}

class Cuadrado extends CuatroCaras {
    private int ladoA;
    private int ladoB;
    public Cuadrado(int ladoA, int ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    int area(){
        return ladoA * ladoB;
    }
}