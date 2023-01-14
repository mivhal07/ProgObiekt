package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz2;

import java.time.LocalDate;

public class Main4_14 {

    public static void main(String[] args) {
        String[] strings = {"KOMG-2002", "BH-2010", "DUSQ-2016", "LUAN-2013", "PANT-2000"};
        String[] stringY = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            stringY[i] = strings[i].split("-")[1];
        }
        int[] intY = new int[stringY.length];
        for (int i = 0; i < intY.length; i++) {
            intY[i] = Integer.parseInt(stringY[i]);
        }
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();

        int[] time = new int[intY.length];
        for (int i = 0; i < intY.length; i++) {
            time[i] = year - intY[i];
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Sprzęt: " + strings[i] + " ma aktualnie: " + time[i] + " lat");
        }
    }
}
