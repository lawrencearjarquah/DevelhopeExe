package Esercizi.ifElse;

public class main {
    public static void main (String[] args) {
        /* Define a variable called myName and assign your name to it
Using the if-else statement, print if the number of letters in your name is even or odd*/

        String myName = "Lawrence";
        if (myName.length() % 2 == 0) {
            System.out.println("è paro");
        }
        else {
            System.out.println("è disparo");
        }
    }
}
