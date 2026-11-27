import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GestorPasajeros {
    private TreeMap<Integer, Pasajero> pasajeros = new TreeMap<>();

    public Boolean registrarPasajero(Pasajero pasajero){
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
       List<Pasajero> listaPasajeros = new ArrayList<>(pasajeros.values());
       return listaPasajeros;
    }

    public List<Pasajero> obtenerAdultosMayores(){
        List<Pasajero> listaAdultos= pasajeros.entrySet().stream().filter(pasajero -> pasajero.getValue().esAdultoMayor()).map(Map.Entry::getValue).toList();
        return listaAdultos;
    }
}
