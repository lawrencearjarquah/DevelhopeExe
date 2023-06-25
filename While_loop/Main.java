package Esercizi.While_loop;
/*Write a while loop for our trading bot!

The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.*
It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
On days where it sells, it can only sell 1000 pounds for euros.
Write a while loop
Use the calculation for exchange rate below
1 + (Math.random() * 0.2);
To recalculate our rate every day (once per loop)
Print the number of days it takes for our bot to sell its pounds*/

public class Main {
    public static void main(String[] args) {
        double tassoCambio = 0;
        int totGiorni = 0;
        int poundDisponibili = 10000;
        while ( poundDisponibili >= 1000) {
            tassoCambio = 1 + (Math.random() * 0.2);
            if (tassoCambio >= 1.15) {
                poundDisponibili -= 1000;
                totGiorni++;
            }
        }
        System.out.println(totGiorni);
    }
}
