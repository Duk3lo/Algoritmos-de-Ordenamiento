import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        int[] numero = new int[] { 19, 24, -19, -28, 5, 30, -12, 34, -9, 52, 0, 45 };

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            if (option == 4) {
                System.out.println("Adios");
                break;
            }

            view.showOrder();
            int orden = view.inputOption(2);
            boolean orderOpt = (orden == 1);
            view.showPasosMenu(null, false);
            int pasos = view.inputOption(2);
            boolean verPasos = (pasos == 1);

            switch (option) {
                case 1:
                    System.out.println("\n--- Método: Selección ---");
                    SortSelection selection = new SortSelection();
                    int[] copia = Arrays.copyOf(numero, numero.length);
                    int[] resSel = selection.sort(copia, orderOpt, verPasos);
                    System.out.print("Arreglo ordenado -> ");
                    selection.printArray(copia);
                    System.out.println("Comparaciones Totales -> " + resSel[0]);
                    System.out.println("Cambios Totales -> " + resSel[1]);
                    break;
                case 2:
                    System.out.println("\n--- Método: Inserción ---");
                    SortInsertion sortInsertion = new SortInsertion();
                    int[] copia2 = Arrays.copyOf(numero, numero.length);
                    int[] resIns = sortInsertion.sort(copia2, orderOpt, verPasos);
                    System.out.print("Arreglo ordenado -> ");
                    sortInsertion.printArray(copia2);
                    System.out.println("Comparaciones Totales -> " + resIns[0]);
                    System.out.println("Cambios Totales -> " + resIns[1]);
                    break;
                case 3:
                    System.out.println("\n--- Método: Burbuja ---");
                    SortBurbble sortBurbble = new SortBurbble();
                    int[] copia3 = Arrays.copyOf(numero, numero.length);
                    int[] resBur = sortBurbble.sort(copia3, orderOpt, verPasos);
                    System.out.print("Arreglo ordenado -> ");
                    sortBurbble.printArray(copia3);
                    System.out.println("Comparaciones Totales -> " + resBur[0]);
                    System.out.println("Cambios Totales -> " + resBur[1]);
                    break;
                default:
                    break;
            }
        }

        view.close();
    }
}
