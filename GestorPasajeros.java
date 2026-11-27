import java.util.List;
import java.util.TreeMap;

public class GestorPasajeros {
    private TreeMap<Integer, Pasajero> pasajeros = new TreeMap<>();

    public boolean registrarPasajero(Pasajero pasajero){
        if(pasajero == null){
            return false;
        }

        if(!pasajeros.containsKey(pasajero.getNumeroAsiento())){ // validacion de numero de asiento tree map hace el ordenamient por asientos
            pasajeros.put(pasajero.getNumeroAsiento(), pasajero);
            return true;
        }
        return false;
    }

    public List<Pasajero> obtenerPasajeros(){
       List<Pasajero> listaPasajeros = List.copyOf(pasajeros.values());
       return listaPasajeros;
    }

    public List<Pasajero> obtenerAdultosMayores(){
            List<Pasajero> listaAdultos= pasajeros.values().stream().filter(Pasajero::esAdultoMayor).toList();
        return listaAdultos;
    }
}
