package principiossolid;

//PRINCIPIO INVERSIÓN DE DEPENDENCIAS
/*Para el ejemplo, se crea una clase que crea los objetos Casa, la cual
/depende de una clase intermedia NuevaPuerta y esta a su vez, depende de la
/interfaz IPuerta, respondiendo así a la inversión de dependencias.*/
public class InversionDeDependencias {
    public static void main(String[] args) {
       IPuerta puerta1 = new NuevaPuerta("Verde");
       Casa miCasa = new Casa(puerta1);       
       System.out.println("La puerta es de color "+ miCasa.colorPuerta());
    }    
}
interface IPuerta {
    String color();
    void abrirPuerta();
}
//Clase intermedia. Esta clase depende la la interface (abstracción)
class NuevaPuerta implements IPuerta {
    private String color;
    public NuevaPuerta(String color){
        this.color = color;
    }
    public String color(){
        return color;
    }
    @Override
    public void abrirPuerta(){
        System.out.println("La puerta está abierta");
    }
}
//Esta clase depende de la clase intermedia
class Casa {
    private IPuerta puerta;
    
    public Casa(IPuerta puerta){
        this.puerta = puerta;
    }
    String colorPuerta(){
        return puerta.color();
    }
}