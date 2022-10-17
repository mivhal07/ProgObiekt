package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nr dnia tygodnia");
        int i = scanner.nextInt();
        switch (i) {
            case (1):
                System.out.println("Poniedziałek");
                break;
            case (2):
                System.out.println("Wtorek");
                break;
            case (3):
                System.out.println("Środa");
                break;
            case (4):
                System.out.println("Czwartek");
                break;
            case (5):
                System.out.println("Piątek");
                break;
            case (6):
                System.out.println("Sobota");
                break;
            case (7):
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nie ma takiego dnia tygodnia!");
        }
    }
}
