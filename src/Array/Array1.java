package Array;

//Scrivi un programma che contenga un metodo che crea un array e lo riempie
// con i numeri da 1 a 10 e che che calcoli la somma dei numeri contenuti
// nell'array inizializzato e la stampi a video.
public class Array1 {
    public static void main(String[] args) {

        int[] arr = creaArray();

        int somma = calcSomma(arr);

        System.out.println("La somma dei numeri nell'array è: " + somma);
    }

    public static int[] creaArray () {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static int calcSomma (int[]arr){
        int somma = 0;
        for (int numero : arr) {
            somma += numero;
        }
        return somma;
    }
}
