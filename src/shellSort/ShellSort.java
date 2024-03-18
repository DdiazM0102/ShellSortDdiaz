package shellSort;

public class ShellSort {

    private static boolean less(int a, int b) {
        return a < b;
    }

    private static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        
        int intervalo = 1;
        while (intervalo < n / 3) {
            intervalo = 3 * intervalo + 1;
        }

        while (intervalo >= 1) {
            for (int i = intervalo; i < n; i++) {
                for (int j = i; j >= intervalo && less(arr[j], arr[j - intervalo]); j -= intervalo) {
                    exch(arr, j, j - intervalo);
                }
            }
            intervalo /= 3;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 54, 2, 3, 10, 20, 14};

        System.out.println("Array antes del ordenamiento:");
        imprimirArray(array);

        sort(array);

        System.out.println("\nArray después del ordenamiento:");
        imprimirArray(array);
    }


    private static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
