package OperatoriComparazione;

public class OperatoriComparazione2 {
    public static void main(String[] args) {

        char char1 = 'a';
        char char2 = 'b';
        
        boolean result = confrontoDueCaratteri(char1, char2);
        
        System.out.println("Il primo carattere è: " + char1);
        System.out.println("Il secondo carattere è: " + char2);
        System.out.println("I caratteri sono diversi? " + result);
    }

    public static boolean confrontoDueCaratteri(char a, char b) {
        if (a == b) {
            System.out.println("I caratteri sono UGUALI! Devono essere diversi.");
        }
        return a != b;
    }
}
