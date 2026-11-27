import java.util.Map;
import java.util.TreeMap;

public class GestorPasajero {
    private TreeMap<Integer, Pasajero> pasajeros = new TreeMap<>();

    public void registrarPasajero(Pasajero pasajero){
        if(pasajero == null){
            return;
        }

        if(!pasajeros.containsKey(pasajero.getNumeroAsiento())){ // validacion de numero de asiento tree map hace el ordenamient por asientos
            pasajeros.put(pasajero.getNumeroAsiento(), pasajero);
            System.out.println("Pasajero Resgitrado Exitosamente");
        }else {
            System.out.println("Numero de Asiento Ya Registrado Intente de Nuevo");
        }
    }

    public void obtenerPasajeros(){
        System.out.println("<--Lista de Pasajeros Por Orden-->");
        for (Map.Entry<Integer, Pasajero> nodo : pasajeros.entrySet()){
            System.out.println("[Numero Asiento: " + "#" + nodo.getKey() + " " + "Pasajero Nombre:" + " " +nodo.getValue().getNombre() +"]");
        }


    }

    public void obtenerAdultosMayores(){
        System.out.println("<--Lista de Pasajeros Adultos Mayores-->");
        for(Map.Entry<Integer, Pasajero> nodo: pasajeros.entrySet()){
            if(nodo.getValue().esAdultoMayor()){
                System.out.println("[Numero Asiento: " + "#" + nodo.getKey() + " " + "Pasajero Nombre:" + " " +nodo.getValue().getNombre() +"]");
            }
        }
    }
}
