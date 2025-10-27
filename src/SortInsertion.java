public class SortInsertion {

    public int[] sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc) {
            return sortAscendente(numeros, pasos);
        } else {
            return sortDsendente(numeros, pasos);
        }
    }

    private int[] sortAscendente(int[] numeros, boolean pasos) {
        int comparaciones = 0;
        int cambios = 0;
        int n = numeros.length;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 1; i < n; i++) {
            int key = numeros[i];
            int j = i - 1;
            boolean moved = false;

            if (pasos) System.out.println("Insertando elemento índice " + i + " valor " + key);

            while (j >= 0) {
                comparaciones++;
                if (numeros[j] > key) {
                    numeros[j + 1] = numeros[j];
                    cambios++;
                    moved = true;
                    if (pasos) {
                        System.out.print("Estado parcial -> ");
                        printArray(numeros);
                    }
                    j--;
                } else {
                    break;
                }
            }
            numeros[j + 1] = key;
            if (moved) {
                cambios++;
                if (pasos) {
                    System.out.print("Estado actual -> ");
                    printArray(numeros);
                }
            }
        }

        return new int[]{comparaciones, cambios};
    }

    private int[] sortDsendente(int[] numeros, boolean pasos) {
        int comparaciones = 0;
        int cambios = 0;
        int n = numeros.length;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 1; i < n; i++) {
            int key = numeros[i];
            int j = i - 1;
            boolean moved = false;

            if (pasos) System.out.println("Insertando elemento índice " + i + " valor " + key);

            while (j >= 0) {
                comparaciones++;
                if (numeros[j] < key) {
                    numeros[j + 1] = numeros[j];
                    cambios++;
                    moved = true;
                    if (pasos) {
                        System.out.print("Estado parcial -> ");
                        printArray(numeros);
                    }
                    j--;
                } else {
                    break;
                }
            }
            numeros[j + 1] = key;
            if (moved) {
                cambios++;
                if (pasos) {
                    System.out.print("Estado actual -> ");
                    printArray(numeros);
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
