package Esercizi.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*-Define a testing class with a main() method where you: -Create a not mutable List of strings called cityNames using
asList() that you populate with 3 city names -Try to add a 4th city name at the end of the List -If you get an exception,
 try to understand why and eventually comment the faulty code -Try to change the 2nd item of the array,
 entering the value Tegucigalpa print the content of cityNames -Define a mutable empty List of strings called kingsOfRome
 -Insert the names of the 7 kings of Rome into the mutable list -Print the content of kingsOfRome
 -Convert kingsOfRome into an array called kingsOfRomeArray, using new String[0] to determine the type of the array
 -.Change the value of the 7th king in kingsOfRomeArray with the value Lucius Tarquinius Supercar

Print the content of kingsOfRomeArray*/
public class Main {
    public static void main(String[] args) {
        String[] list = {"Milano","Roma","Napoli"};
        final List<String> cityNames = new ArrayList<>(Arrays.asList(list));
        try{
            cityNames.add("Genova");
        }catch (Exception exc){
            exc.printStackTrace();
            System.exit(-1);
        }
        cityNames.add(1,"Tegucigalpa");
        System.out.println(cityNames);

        ArrayList<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        for (String king:kingsOfRomeArray) {
            System.out.println(king);
        }
    }
}
