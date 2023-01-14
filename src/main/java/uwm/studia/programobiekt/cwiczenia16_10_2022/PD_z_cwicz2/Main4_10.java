package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main4_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz datę w formacie DD-MM-RRRR");
        String[] s = scanner.nextLine().split("-");
        System.out.println(LocalDate.of(Integer.parseInt(s[2]), Integer.parseInt(s[1]), Integer.parseInt(s[0])).getMonth());
    }
}
