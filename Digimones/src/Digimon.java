import java.util.Random;

/**
 * La clase Digimon representa a un personaje del mundo de Digimon.
 * Cada Digimon tiene un nombre, nivel, puntos de ataque, salud y dos puntos de defensa.
 * @author Ivan
 */
public class Digimon {
    private String nombre;  // Nombre del Digimon
    private int nivel;      // Nivel del Digimon
    private int ataque;     // Puntos de ataque del Digimon
    private int salud;      // Salud del Digimon
    private int dp1;        // Puntos de defensa 1 del Digimon
    private int dp2;        // Puntos de defensa 2 del Digimon

    /**
     * Constructor de Digimon que inicializa sus atributos.
     *
     * @param nombre Nombre del Digimon.
     */
    public Digimon(String nombre) {
        this.nombre = nombre;
        Random rand = new Random();
        this.nivel = rand.nextInt(5) + 1;  // Nivel entre 1 y 5
        this.ataque = 2 * nivel;           // Ataque = 2 * Nivel
        this.salud = 10 * nivel;           // Salud = 10 * Nivel
        this.dp1 = 10;                     // DP1 inicial = 10
        this.dp2 = 10;                     // DP2 inicial = 10
    }

    /**
     * Método que representa el primer ataque del Digimon.
     *
     * @return El daño causado por el primer ataque.
     */
    public int ataque1() {
        dp1--;                             // DP1 disminuye en 1
        return ataque;                     // Daño igual al ataque
    }

    /**
     * Método que representa el segundo ataque del Digimon.
     *
     * @return El daño causado por el segundo ataque.
     */
    public int ataque2() {
        dp2 -= 2;                          // DP2 disminuye en 2
        return 2 * ataque;                 // Daño igual al doble del ataque
    }

    /**
     * Método que verifica si el Digimon es capturable.
     *
     * @return Verdadero si la salud del Digimon es menor o igual a 20, falso en caso contrario.
     */
    public boolean capturable() {
        return salud <= 20;                // Capturable si salud <= 20
    }

    // Getters and Setters

    /**
     * Obtiene el nombre del Digimon.
     *
     * @return El nombre del Digimon.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el nivel del Digimon.
     *
     * @return El nivel del Digimon.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Obtiene los puntos de ataque del Digimon.
     *
     * @return Los puntos de ataque del Digimon.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Obtiene la salud del Digimon.
     *
     * @return La salud del Digimon.
     */
    public int getSalud() {
        return salud;
    }

    /**
     * Establece la salud del Digimon.
     *
     * @param salud La nueva salud del Digimon.
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * Obtiene los puntos de defensa 1 del Digimon.
     *
     * @return Los puntos de defensa 1 del Digimon.
     */
    public int getDp1() {
        return dp1;
    }

    /**
     * Establece los puntos de defensa 1 del Digimon.
     *
     * @param dp1 Los nuevos puntos de defensa 1 del Digimon.
     */
    public void setDp1(int dp1) {
        this.dp1 = dp1;
    }

    /**
     * Obtiene los puntos de defensa 2 del Digimon.
     *
     * @return Los puntos de defensa 2 del Digimon.
     */
    public int getDp2() {
        return dp2;
    }

    /**
     * Establece los puntos de defensa 2 del Digimon.
     *
     * @param dp2 Los nuevos puntos de defensa 2 del Digimon.
     */
    public void setDp2(int dp2) {
        this.dp2 = dp2;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Digimon.
     *
     * @return Una cadena que representa el objeto Digimon.
     */
    @Override
    public String toString() {
        return "Digimon{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", ataque=" + ataque +
                ", salud=" + salud +
                ", dp1=" + dp1 +
                ", dp2=" + dp2 +
                '}';
    }
}
