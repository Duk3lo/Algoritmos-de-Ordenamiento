import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        System.out.println("Metedos de Ordenamiento");
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\nMenu Metodos");
        System.out.println("1-> Seleccion");
        System.out.println("2-> Inserction");
        System.out.println("3-> Bubble");
        System.out.println("4-> Salir");
        System.err.println("Seleccione la Opcion");
    }

    public int inputOption(int max) {
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 1 && option <= max)
                    break;
            } else {
                scanner.next();
            }
            System.out.println("Opcion Invalida");
        }
        return option;
    }

    public void showOrder(){
        System.out.println("\n-Seleccione el Orden-");
        System.out.println("1-> Ascendente");
        System.out.println("2-> Desendente");
        System.out.println("Seleccione la Opcion");
    }

    public void showPasosMenu(int [] numeros, boolean ver){
        System.out.println("\n-Ver pasos?-");
        System.out.println("1-> Si");
        System.out.println("2-> No");
        System.out.println("Seleccione la Opcion");
    }

    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
