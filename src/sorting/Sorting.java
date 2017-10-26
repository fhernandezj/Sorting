/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author fhernandez
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {51,95,66,72,42,38,39,41,15};
        
        System.out.println("Unsorted:");
        printArray(arr);
        
        //selectionSort(arr);
        //bubbleSort(arr);
        //insertionSort(arr);
        //quickSort(arr,0,arr.length-1);
        
        System.out.println("Sorted:");
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]) {
        int key, j;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void quickSort(int arr[], int izq, int der) {

        int pivote = arr[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (arr[i] <= pivote && i < j) {
                i++;
            }
            while (arr[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }
        arr[izq] = arr[j];
        arr[j] = pivote;
        if (izq < j - 1) {
            quickSort(arr, izq, j - 1);
        }
        if (j + 1 < der) {
            quickSort(arr, j + 1, der);
        }
    }

}
