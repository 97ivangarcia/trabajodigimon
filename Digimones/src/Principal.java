import java.util.Scanner;

/**
 * La clase Principal es la clase principal del programa que inicia la batalla digital.
 */
public class Principal {

    /**
     * El método main inicia la ejecución del programa.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del Domador:");
        String nombreDomador = scanner.nextLine();

        // Se crea un nuevo domador con el nombre proporcionado por el usuario
        Domador domador = new Domador(nombreDomador);

        // Se inicia la batalla digital con el domador recién creado
        BatallaDigital batalla = new BatallaDigital(domador);
        batalla.iniciar();
    }
}
