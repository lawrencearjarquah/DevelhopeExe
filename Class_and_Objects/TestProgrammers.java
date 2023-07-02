package Esercizi.Class_and_Objects;

public class TestProgrammers {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Ryan",27,true);
        Programmer programmer2 = new Programmer("Mark",32,false);


        programmer1.drinkCoffee();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();

    }
}
