public class SortSelection {

    public int[] sort(int[] numeros, boolean asc, boolean pasos) {
        if (asc) {
            return insertionAscendente(numeros, pasos);
        } else {
            return insertionDescendente(numeros, pasos);
        }
    }

    // Insertion ascendente
    private int[] insertionAscendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        int comparaciones = 0;
        int movimientos = 0;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 1; i < n; i++) {
            int key = numeros[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("Insertando " + key + " en la sublista [0.." + (i - 1) + "]");
            }

            while (j >= 0) {
                comparaciones++;
                if (numeros[j] > key) {
                    numeros[j + 1] = numeros[j];
                    movimientos++;
                    if (pasos) {
                        System.out.print("Desplazar: " + numeros[j] + " de pos " + j + " a pos " + (j + 1) + " -> ");
                        printArray(numeros);
                    }
                    j--;
                } else {
                    break;
                }
            }
            numeros[j + 1] = key;
            if (pasos) {
                System.out.print("Insertado " + key + " en pos " + (j + 1) + " -> ");
                printArray(numeros);
            }
        }

        return new int[] { comparaciones, movimientos };
    }

    // Insertion descendente
    private int[] insertionDescendente(int[] numeros, boolean pasos) {
        int n = numeros.length;
        int comparaciones = 0;
        int movimientos = 0;

        System.out.print("Arreglo original -> ");
        printArray(numeros);

        for (int i = 1; i < n; i++) {
            int key = numeros[i];
            int j = i - 1;

            if (pasos) {
                System.out.println("Insertando " + key + " (descendente) en la sublista [0.." + (i - 1) + "]");
            }

            // desplazar elementos menores que key hacia la derecha
            while (j >= 0) {
                comparaciones++;
                if (numeros[j] < key) {
                    numeros[j + 1] = numeros[j];
                    movimientos++;
                    if (pasos) {
                        System.out.print("Desplazar: " + numeros[j] + " de pos " + j + " a pos " + (j + 1) + " -> ");
                        printArray(numeros);
                    }
                    j--;
                } else {
                    break;
                }
            }
            numeros[j + 1] = key;
            if (pasos) {
                System.out.print("Insertado " + key + " en pos " + (j + 1) + " -> ");
                printArray(numeros);
            }
        }

        return new int[] { comparaciones, movimientos };
    }

    public void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
