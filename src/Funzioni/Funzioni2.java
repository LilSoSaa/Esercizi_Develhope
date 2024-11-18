package Funzioni;

//Definire una funzione che accetti in ingresso una stringa
// e ne restituisca la lunghezza
public class Funzioni2 {
    public static void main(String[] args) {

        String parola = "Mimmuzzo svegliati!";

        System.out.println("La lunghezza della Stringa è: " + lunghezzaStringa(parola));
    }


    public static int lunghezzaStringa(String parola) {
        return parola.length();
    }
}
