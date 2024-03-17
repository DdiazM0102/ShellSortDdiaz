package shellSort;

public class ShellSort {
    public static void main(String[] args) {

        int[] array = {12, 34, 54, 2, 3, 21, 10, 31};

        System.out.println("Array antes del ordenamiento:");
        imprimirArray(array);
        
        shellSort(array);
        
        System.out.println("\nArray después del ordenamiento:");
        imprimirArray(array);
    }

    static void shellSort(int arr[]) {
        int n = arr.length;

        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {

            for (int i = intervalo; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= intervalo && arr[j - intervalo] > temp; j -= intervalo) {
                    arr[j] = arr[j - intervalo];
                }
                arr[j] = temp;
            }
        }
    }

    static void imprimirArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
