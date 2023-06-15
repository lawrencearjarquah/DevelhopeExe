package Esercizi.BooleanOperators;

public class main {
    public static void main (String[] args){
       //conditionA = 2 <= 2 && !true --> False
        // conditionB = !false && 3 > 2 --> True
        // conditionC = considering that t=false and f=true: !(!t || f) --> False
        // conditionD = 6 > 6 ^ !(true && true) --> False

        Boolean conditionA = 2 <= 2 && !true;
        Boolean conditionB = !false && 3 > 2;
        Boolean conditionC =  !(!false || true);
        Boolean conditionD = 6 > 6 ^ !(true && true);

        System.out.println(conditionA);
        System.out.println(conditionB);
        System.out.println(conditionC);
        System.out.println(conditionD);
    }
}
