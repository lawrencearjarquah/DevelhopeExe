package Esercizi.Arrays;

/*-Define a testing class with a main() method where you: -Define an array of strings called carBrands that is populated with 5 famous car brand names

Print in console the number of items of the carBrands array
Print in console the 3rd item of carBrands array -Declare an empty array of integers called primeNumbers with a predefined size of 6 items
Iinsert one by one the values of the first 6 prime numbers, populating primeNumbers array -Print in console all the content of the already populated primeNumbers array*/

public class Main {
    public static void main(String[] args) {
        String[] carBrands= new String[5];
        carBrands[0]= "Renault";
        carBrands[1]= "Toyota";
        carBrands[2]= "VW";
        carBrands[3]= "Lamborghini";
        carBrands[4]= "Citroen";

        System.out.println(carBrands.length);
        System.out.println(carBrands[2]);

        int[] primeNumbers = new int[6];
        int j = 0;
        for (int i = 2; i < 1000; i++) {
            if (j < primeNumbers.length){
                if (i==2){
                    primeNumbers[j] = i;
                    j++;
                } else {
                    if(i % 2 != 0){
                        int divisore = 3;
                        int count = 0;
                        while (divisore < 1000){
                            if (i % divisore == 0){
                                count++;
                            }
                            divisore++;
                        }
                        if(count == 1){
                            primeNumbers[j] = i;
                            j++;
                        }
                    }
                }
            }

        }
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);
        }

    }
}
