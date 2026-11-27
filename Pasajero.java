public class Pasajero {

    private final String nombre;
    private final int edad;
    private final int numeroAsiento;

    private static final int EDAD_ADULTO_MAYOR = 60;

    public Pasajero(String nombre, int edad, int numeroAsiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroAsiento = numeroAsiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public boolean esAdultoMayor() {
        return edad >= EDAD_ADULTO_MAYOR;
    }
}
