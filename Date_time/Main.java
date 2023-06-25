package Esercizi.Date_time;

import java.time.LocalDate;
import java.time.Year;
import java.time.Period;


/*Using LocaleDate or another Date class calculate and print:
How many days are left till the end of the month
How many days are left till the end of the year, using the length() method from java.time.Year.of()*/
public class Main {
    public static void main(String[] args) {
        LocalDate oggi = LocalDate.now();
        LocalDate inizioMeseSuccessivo = LocalDate.of(oggi.getYear(),oggi.getMonthValue() + 1,1);
        Period differenza = Period.between(oggi,inizioMeseSuccessivo);
        System.out.println(differenza.getDays()-1);

        int numeroGiorniAnno = Year.of(oggi.getYear()).length();
        int mesePrecedente = oggi.getMonthValue() - 1;
        int totaleGiorniTrascorsi = 0;
        while(mesePrecedente != 0){
            switch(mesePrecedente){
                case 1:
                    totaleGiorniTrascorsi += 31;
                    break;
                case 2:
                    if(numeroGiorniAnno == 365){
                        totaleGiorniTrascorsi += 28;
                    }else{
                        totaleGiorniTrascorsi += 29;
                    }
                    break;
                case 3:
                    totaleGiorniTrascorsi += 31;
                    break;
                case 4:
                    totaleGiorniTrascorsi += 30;
                    break;
                case 5:
                    totaleGiorniTrascorsi += 31;
                    break;
                case 6:
                    totaleGiorniTrascorsi += 30;
                    break;
                case 7:
                    totaleGiorniTrascorsi += 31;
                    break;
                case 8:
                    totaleGiorniTrascorsi += 31;
                    break;
                case 9:
                    totaleGiorniTrascorsi += 30;
                    break;
                case 10:
                    totaleGiorniTrascorsi += 31;
                    break;
                case 11:
                    totaleGiorniTrascorsi += 30;
                    break;
                case 12:
                    totaleGiorniTrascorsi += 31;
                    break;
            }
            mesePrecedente--;
        }
        int meseAttuale = oggi.getMonthValue();
        if(meseAttuale == 1 || meseAttuale == 3 || meseAttuale == 5 || meseAttuale == 7 || meseAttuale == 8 || meseAttuale == 10 || meseAttuale == 12){
            totaleGiorniTrascorsi += (31 - (differenza.getDays() - 1));
        }else if(meseAttuale == 2){
            if(numeroGiorniAnno == 365){
                totaleGiorniTrascorsi += (28 - (differenza.getDays() - 1));
            }else{
                totaleGiorniTrascorsi += (29 - (differenza.getDays() - 1));
            }
        }else{
            totaleGiorniTrascorsi += (30 - (differenza.getDays() - 1));
        }
        System.out.println(numeroGiorniAnno - totaleGiorniTrascorsi);
    }
}
