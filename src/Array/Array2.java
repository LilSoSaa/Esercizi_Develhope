package Array;
//Scrivi un programma che contenga un metodo che crea un array e lo
// riempie con dei caratteri. Questo metodo dovrà poi stampare tutte
// le occorrenze del carattere a o 0 in caso non ce ne siano.
public class Array2 {
    public static void main(String[] args) {

        char[] caratteri = creaArray();//chiamare metodo per creazione array
    }

    //creazione metodo
    public static char[] creaArray() {
        char[] array = {'z', 'a', 'c', 'A', 'r', 'a', 'm', 's', 'a', 'p', 'q', 'b', 'a', 'u'};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
        if (array[i] == 'a') {
            count++;
              }
        }

        System.out.println("Nell'array vi sono " + count + " 'a'");
        return  array;
    }

}
