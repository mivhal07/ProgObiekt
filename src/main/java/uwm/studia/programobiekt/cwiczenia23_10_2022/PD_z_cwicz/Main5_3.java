package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Arrays;
import java.util.Scanner;

public class Main5_3 {

    public static void main(String[] args) {

        System.out.println("Podaj współrzędne punktu A (X,Y), np. 2,4");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(",");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int[] pktA = {x, y};
        przesun(pktA);

    }

    public static void przesun(int[] pktA) {
        int[] wek = {3, 2};
        pktA[0] += wek[0];
        pktA[1] += wek[1];
        System.out.println("Przesunięty punkt o wartość wektora to: " + Arrays.toString(pktA));
    }
}
