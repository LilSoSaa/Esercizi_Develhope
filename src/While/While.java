package While;
//Scrivere un programma che contenga un metodo che sfrutti il while loop
// e prenda in ingresso 1 valore intero come limite superiore e calcoli
// la somma di tutti i valori prima del limite e la stampi a video.
//(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
public class While {
    public static void main(String[] args) {

        int numero = 9;
        int num = 0;
        int somma = 0;

        while (num < 9) {
            somma+= num;
            System.out.println("Numero attuale: " + num + " Somma attuale: " + somma);
            num++;
        }

        System.out.println("Somma FINALE è: " + somma);

    }
}
