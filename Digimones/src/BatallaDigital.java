import java.util.Random;
import java.util.Scanner;

/**
 * La clase BatallaDigital simula una batalla entre el equipo de un Domador y un Digimon enemigo.
 */
public class BatallaDigital {
    private Domador domador;  // El domador que participa en la batalla
    private Digimon enemigo;  // El Digimon enemigo

    /**
     * Constructor de BatallaDigital que inicializa el domador y genera un enemigo aleatorio.
     *
     * @param domador El domador que participará en la batalla.
     */
    public BatallaDigital(Domador domador) {
        this.domador = domador;
        this.enemigo = generarEnemigoAleatorio();
    }

    /**
     * Genera un Digimon enemigo aleatorio.
     *
     * @return Un Digimon enemigo aleatorio.
     */
    private Digimon generarEnemigoAleatorio() {
        String[] nombres = {"Gabumon", "Patamon"};
        Random rand = new Random();
        String nombreAleatorio = nombres[rand.nextInt(nombres.length)];
        return new Digimon(nombreAleatorio);
    }

    /**
     * Inicia la batalla digital entre el equipo del domador y el Digimon enemigo.
     */
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        // Mientras el equipo del domador tenga menos de 3 Digimon, continúa la batalla
        while (domador.getEquipo().size() < 3) {
            System.out.println("1. Iniciar batalla");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 2) break;

            enemigo = generarEnemigoAleatorio();
            System.out.println("¡Un " + enemigo.getNombre() + " salvaje apareció!");

            // Elige el Digimon al inicio de la batalla
            System.out.println("Elige un Digimon de tu equipo:");
            for (int i = 0; i < domador.getEquipo().size(); i++) {
                System.out.println(i + ". " + domador.getEquipo().get(i).getNombre());
            }
            int elegido = scanner.nextInt();
            Digimon miDigimon = domador.getEquipo().get(elegido);

            // Mientras el enemigo tenga salud mayor a 0, se llevan a cabo turnos de ataques
            while (enemigo.getSalud() > 0) {
                System.out.println("Elige tu acción:");
                System.out.println("1. Ataque1");
                System.out.println("2. Ataque2");
                System.out.println("3. Capturar");
                int accion = scanner.nextInt();

                if (accion == 1) {
                    enemigo.setSalud(enemigo.getSalud() - miDigimon.ataque1());
                    System.out.println("Usaste Ataque1. La salud del enemigo ahora es: " + enemigo.getSalud());
                } else if (accion == 2) {
                    enemigo.setSalud(enemigo.getSalud() - miDigimon.ataque2());
                    System.out.println("Usaste Ataque2. La salud del enemigo ahora es: " + enemigo.getSalud());
                } else if (accion == 3) {
                    if (enemigo.capturable()) {
                        domador.agregarDigimon(enemigo);
                        break;
                    } else {
                        System.out.println("El enemigo no se puede unir");
                    }
                }

                if (enemigo.getSalud() <= 0) {
                    System.out.println("Has derrotado al enemigo");
                    break;
                }
            }
        }

        // Si el equipo del domador tiene 3 Digimon, se muestra un mensaje de victoria
        if (domador.getEquipo().size() == 3) {
            System.out.println("¡Has capturado a los 3 Digimon!");
        }
    }
}