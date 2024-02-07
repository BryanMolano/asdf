
package proyectoseguro;
import Modelo.Vehiculo;
public class ProyectoSeguro {
    private Vehiculo vehiculo1;
    public static void main(String[] args) {
        //crear ojbjeto con constructor base
        Vehiculo obV = new Vehiculo();
        System.out.println(obV.toString());
        //crear ojbjeto con constructor 
        Vehiculo obV1 = new Vehiculo("ABC123", "Mazda", 2000, 1500000);
        System.out.println(obV1.toString());
    }
    
}
