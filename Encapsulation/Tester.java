package Esercizi.Encapsulation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert amount of floors: ");
        int floorNumbers = scanner.nextInt();

        scanner.nextLine();


        System.out.println("what is the address of the house?");
        String address = scanner.nextLine();

        System.out.println("who are the residents of the house? (list of the people separeted by comma)");
        String residentsNames = scanner.nextLine();

        String[] nomiSeparati = residentsNames.split(",");

        House bigHouse = new House(floorNumbers,address,nomiSeparati);

        System.out.println(String.format("the bigHouse has %d floors and it is in %s. The names of the residents are ", bigHouse.getFloorsNumber(),bigHouse.getAddress()) + Arrays.toString(bigHouse.getResidentsNames()));
    }
}
