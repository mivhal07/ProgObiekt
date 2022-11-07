package uwm.studia.programobiekt.cwiczenia06_11_2022;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6_4 {
    public static String i1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StanLicznika stanLicznika = new StanLicznika();
        while (true) {
            System.out.println("Wybierz co chcesz zrobić: ");
            System.out.println("1 - Aby zobaczyć początkowy stan licznika");
            System.out.println("2 - Aby zobaczyć bieżący stan licznika");
            System.out.println("3 - Aby obliczyć zużycie energii, za ostatni miesiąc");
            System.out.println("4 - Aby zmienić bieżący stan licznika");
            System.out.println("Nie poprawna wartość kończy pracę programu");
            int i = scanner.nextInt();
            switch (i) {
                case (1):
                    System.out.println(stanLicznika.getPoczatStanLicznika());
                    break;
                case (2):
                    System.out.println(stanLicznika.getBierzstanLicznika());
                    break;
                case (3):
                    System.out.println("Wpisz wartość dla nowego stanu licznika");
                    int i2 = scanner.nextInt();
                    int i3 = (int) (i2 - stanLicznika.getBierzstanLicznika());
                    stanLicznika.setBierzstanLicznika(i2);
                    System.out.println("Zużycie w tym miesiącu wynosi: " + i3);
                    break;
                case (4):
                    System.out.println("Wpisz wartość dla zaktualizowanego stanu licznika");
                    int i1 = scanner.nextInt();
                    stanLicznika.setBierzstanLicznika(i1);

                    Path path1 = Paths.get("stany_licznika_od_początku.txt");
                    try {
                        FileWriter myWriter = new FileWriter("stany_licznika_od_początku.txt");
                        myWriter.write(i1);
                        myWriter.close();
                    } catch (IOException ex) {
                        System.out.println("Nie można zapisać pliku.");
                    }
                default:
                    System.out.println("Dziękuje, do widzenia :)");
                    break;
            }
        }


    }
}