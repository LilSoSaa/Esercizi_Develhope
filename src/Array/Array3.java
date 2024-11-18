package Array;
//Scrivere un programma che contenga un metodo che permetta di sostituire
// gli elementi duplicati in un array di interi con il valore -1. L'array
// ottenuto dovrà essere stampato a video.
public class Array3 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 17, 6, 12, 17, 21, 23, 16, 6, 12};

        // Stampa dell'array prima della modifica
        System.out.print("Array iniziale: ");
        stampaArray(arr);

        // Chiama il metodo per sostituire i duplicati
        sostituzioneDuplicate(arr);

        // Stampa dell'array modificato finale
        System.out.println("\nArray finale modificato:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Metodo per sostituire i duplicati con -1
    public static void sostituzioneDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // Primo ciclo: scorre tutti gli elementi dell'array

            for (int j = i + 1; j < arr.length; j++) { // Secondo ciclo: parte dall'elemento successivo a i
                // Se il valore arr[i] è uguale a arr[j], sostituire arr[j] con -1
                if (arr[i] == arr[j]) {
                    arr[j] = -1;  // Sostituisce i duplicati con -1

                }
            }
        }
    }
    // Metodo per stampare l'intero array
    public static void stampaArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

