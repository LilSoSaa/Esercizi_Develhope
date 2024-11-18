package OperatoriAssegnazione;

//Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.
//Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.
public class OperatoriAssegnazione {
    public static void main(String[] args) {

        int a = 12;
        int b = 15;

        int result = incrementaEMoltiplica(a, b);

        System.out.println("Il risultato dell'operazione equivale a: " + result);
    }

    public static int incrementaEMoltiplica (int a, int b) {
        int incremento = 6;

        a+= incremento;
        b+= incremento;

        return a * b;
    }

}
