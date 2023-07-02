package Esercizi.Class_and_Objects;

public class TestProgrammers {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();
         programmer1.name = "Ryan";
         programmer2.name = "Mcd ark";
         programmer1.age = 27;
         programmer2.age = 32;

        programmer1.drinkCoffee();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses(false);

    }
}
