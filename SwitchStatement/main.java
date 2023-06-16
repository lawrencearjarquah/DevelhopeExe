package Esercizi.SwitchStatement;
import java.util.Scanner;
public class main {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    while (true){
        System.out.println("inserisci un numero tra 1 e 10:");
    int    number = input.nextInt();
        switch(number){
            case 1:
                System.out.println("uno");
            break;
            case 2:
                System.out.println("due");
            break;
            case 3:
                System.out.println("tre");
            break;
            case 4:
                System.out.println("quattro");
            break;
            case 5:
                System.out.println("cinque");
            break;
            case 6:
                System.out.println("sei");
            break;
            case 7:
                System.out.println("sette");
            break;
            case 8:
                System.out.println("otto");
            break;
            case 9:
                System.out.println("nove");
            break;
            case 10:
                System.out.println("dieci");
            break;
            default:
                System.out.println("Non posso darti il nome del numero");
            break;
        }
        if(number < 1 || number > 10){
            break;
        }
    }
                }
        }

