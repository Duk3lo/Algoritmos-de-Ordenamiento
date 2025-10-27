public class SortSelection {

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
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (numeros[j] < numeros[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                if (pasos) {
                    System.out.println("Intercambio: " + numeros[i] + " <-> " + numeros[minIdx]);
                }
                int temp = numeros[i];
                numeros[i] = numeros[minIdx];
                numeros[minIdx] = temp;
                cambios++;
                if (pasos) {
                    System.out.print("Estado actual -> ");
                    printArray(numeros);
                }
            } else {
                if (pasos) {
                    System.out.println("Posición " + i + " ya correcta.");
                }
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
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (numeros[j] > numeros[maxIdx]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                if (pasos) {
                    System.out.println("Intercambio: " + numeros[i] + " <-> " + numeros[maxIdx]);
                }
                int temp = numeros[i];
                numeros[i] = numeros[maxIdx];
                numeros[maxIdx] = temp;
                cambios++;
                if (pasos) {
                    System.out.print("Estado actual -> ");
                    printArray(numeros);
                }
            } else {
                if (pasos) {
                    System.out.println("Posición " + i + " ya correcta.");
                }
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
