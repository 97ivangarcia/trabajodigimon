import java.util.ArrayList;

/**
 * La clase Domador representa a un domador de Digimon que puede tener un equipo de Digimon.
 * Cada Domador tiene un nombre y un equipo de Digimon.
 * @author Ivan
 */
public class Domador {
    private String nombre;                  // Nombre del domador
    private ArrayList<Digimon> equipo;      // Equipo de Digimon del domador

    /**
     * Constructor de Domador que inicializa el nombre y agrega un Digimon inicial al equipo.
     *
     * @param nombre Nombre del domador.
     */
    public Domador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
        this.equipo.add(new Digimon("Agumon"));  // Comienza con un Agumon
    }

    /**
     * Método para agregar un Digimon al equipo del domador.
     *
     * @param digimon El Digimon a agregar al equipo.
     */
    public void agregarDigimon(Digimon digimon) {
        if (equipo.size() < 3) {
            equipo.add(digimon);
            System.out.println(digimon.getNombre() + " se ha unido a tu equipo");
        } else {
            System.out.println("No puedes agregar más Digimon a tu equipo");
        }
    }

    // Getters and Setters

    /**
     * Obtiene el nombre del domador.
     *
     * @return El nombre del domador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el equipo de Digimon del domador.
     *
     * @return El equipo de Digimon del domador.
     */
    public ArrayList<Digimon> getEquipo() {
        return equipo;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Domador.
     *
     * @return Una cadena que representa el objeto Domador.
     */
    @Override
    public String toString() {
        return "Domador{" +
                "nombre='" + nombre + '\'' +
                ", equipo=" + equipo +
                '}';
    }
}