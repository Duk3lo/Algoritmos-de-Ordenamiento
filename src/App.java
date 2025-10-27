public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        int[] numero = new int[] { 4, 3, 9, 7, 8 };

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);
            view.showOrder();
            int orden = view.inputOption(2);
            boolean orderOpt = (orden == 1);
            view.showPasosMenu(null, false);
            int pasos = view.inputOption(2);

            switch (option) {
                case 1:
                    System.out.println("Metodo Sleccion");
                    SortSelection selection = new SortSelection();
                    selection.sort(numero, orderOpt, pasos == 1);
                    break;
                case 2:
                    System.out.println("Metodo Inserccion");
                    view.showOrder();
                    SortInsertion sortInsertion = new SortInsertion();
                    sortInsertion.sort(numero, orderOpt, pasos == 1);
                    break;
                case 3:
                    System.out.println("Metodo Burbuja");
                    SortBurbble sortBurbble = new SortBurbble();
                    sortBurbble.sort(numero, orderOpt, orderOpt);
                    break;
                case 4:
                    System.out.println("Adios");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
