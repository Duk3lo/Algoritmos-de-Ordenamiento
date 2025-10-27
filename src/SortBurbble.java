public class SortBurbble {

    public int[] sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc) {
            return sortAscendente(numeros, pasos);
        } else {
            return sortDsendente(numeros, pasos);
        }
    }

    private int[] sortAscendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        int comparaciones = 0;
        int cambios = 0;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 0; i < n - 1; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                if (numeros[j] > numeros[j + 1]) {
                    if (pasos) {
                        System.out.println("Intercambio en índices " + j + " y " + (j + 1));
                    }
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    cambios++;
                    hayCambio = true;
                    if (pasos) {
                        System.out.print("Estado parcial -> ");
                        printArray(numeros);
                    }
                }
            }
            if (!hayCambio) {
                if (pasos) System.out.println("No hubo cambios en la pasada " + (i + 1));
                break;
            }
        }

        return new int[]{comparaciones, cambios};
    }

    private int[] sortDsendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        int comparaciones = 0;
        int cambios = 0;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 0; i < n - 1; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;
                if (numeros[j] < numeros[j + 1]) {
                    if (pasos) {
                        System.out.println("Intercambio en índices " + j + " y " + (j + 1));
                    }
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    cambios++;
                    hayCambio = true;
                    if (pasos) {
                        System.out.print("Estado parcial -> ");
                        printArray(numeros);
                    }
                }
            }
            if (!hayCambio) {
                if (pasos) System.out.println("No hubo cambios en la pasada " + (i + 1));
                break;
            }
        }

        return new int[]{comparaciones, cambios};
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
