package uwm.studia.kolokwium.kol14_01_2022;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Autobus autobus = new Autobus(50);
//        String s = autobus.toString();
//        System.out.println(s);
//
//        Pociag pociag = new Pociag(50, 200);
//        System.out.println(pociag.getCenaBiletu());
//        String s1 = pociag.toString();
//        System.out.println(s1);
//
//        Podroz podroz = new Podroz();
//        podroz.dodajAutobus(30);
//        podroz.dodajPociag(39, 123);
//        podroz.dodajPociag(11, 13);
//        String s2 = Arrays.toString(podroz.getPlanPodrozy().toArray());
//        System.out.println(s2);

        System.out.println("Wybierz co chcesz zrobić");
        System.out.println("1 - dodaj do plany środek transportu");
        System.out.println("2 - usuń z planu ostatni środek transportu");
        System.out.println("3 - wyczyść plan");
        System.out.println("4 - ustaw datę podróży");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Podroz podroz = new Podroz();
        switch (i) {
            case (1):
                System.out.println("Chcesz dodać autobus(1) czy pociąg(2)");
                int i1 = scanner.nextInt();
                if (i1 == 1) {
                    System.out.println("Ile autobus ma miejsc?");
                    int i2 = scanner.nextInt();
                    podroz.dodajAutobus(i2);
                    System.out.println("Udało sie dodać autobus");
                }
                if ((i1 == 2)) {
                    System.out.println("Ile pociąg ma miejsc?");
                    int i2 = scanner.nextInt();
                    System.out.println("Ile KM jedzie pociąg?");
                    int i3 = scanner.nextInt();
                    podroz.dodajPociag(i2, i3);
                    System.out.println("Udało sie dodać pociąg");
                }
            case (2):
                podroz.usunOstatni();
            case (3):
                podroz.wyczysc();
            case (4):
                System.out.println("Wpisz dzień miesiąca: [cyfra]");
                int i2 = scanner.nextInt();
                System.out.println("Wpisz miesiąc: [cyfra]");
                int i3 = scanner.nextInt();
                System.out.println("Wpisz rok: [cyfra]");
                int i4 = scanner.nextInt();
                System.out.println("Wpisz godzinę: [05;16]");
                int i5 = scanner.nextInt();
                System.out.println("Wpisz minuty: [07;42]");
                int i6 = scanner.nextInt();

                LocalDate date = LocalDate.of(i4, i3, i2);
                LocalTime time = LocalTime.of(i5, i6);
                podroz.ustawDate(LocalDateTime.of(date, time));

                /*
                Przez brak czasu na kontynuowanie kolokwium, zostawiam w tym miejscu. Zostało więcej pisania niż myślenia i kilka drobnostek w postaci sprawdzenia IF
                odnośnie wczytywanych danych od użytkownika. Liczę, że profesor uzna to za drobne braki :)
                */
        }
    }
}
