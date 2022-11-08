package uwm.studia.programobiekt.cwiczenia06_11_2022.Main6_11;

import java.util.Scanner;

public class Main6_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz program, który chcesz użyć:");
            System.out.println("1 - Kalkulator");
            System.out.println("2 - Wskaźnik BMI");
            System.out.println("3 - Silnie z liczby!");
            System.out.println("'quit' - wyjście z programu");
            String i = scanner.nextLine();
            switch (i) {
                case ("1"):
                    Kalkulator kalkulator = new Kalkulator();
                    System.out.println("Wybierz działanie:");
                    System.out.println("1 - dodawanie");
                    System.out.println("2 - odejmowanie");
                    System.out.println("3 - mnożenie");
                    System.out.println("4 - dzielenie");
                    System.out.println("5 - pierwiastkowanie");
                    System.out.println("6 - potęgowanie");
                    String j = scanner.nextLine();
                    switch (j) {
                        case ("1"):
                            System.out.println("Podaj składnik nr 1");
                            int i1 = scanner.nextInt();
                            kalkulator.setLiczba1(i1);
                            System.out.println("Podaj składnik nr 2");
                            int i2 = scanner.nextInt();
                            kalkulator.setLiczba2(i2);
                            double dodawanie = kalkulator.dodawanie();
                            System.out.println(i1 + " + " + i2 + " = " + dodawanie);
                            break;
                        case ("2"):
                            System.out.println("Podaj odjemną");
                            int k1 = scanner.nextInt();
                            kalkulator.setLiczba1(k1);
                            System.out.println("Podaj odjemnik");
                            int k2 = scanner.nextInt();
                            kalkulator.setLiczba2(k2);
                            double odejmowanie = kalkulator.odejmowanie();
                            System.out.println(k1 + " - " + k2 + " = " + odejmowanie);
                            break;
                        case ("3"):
                            System.out.println("Podaj czynnik nr 1");
                            int a1 = scanner.nextInt();
                            kalkulator.setLiczba1(a1);
                            System.out.println("Podaj czynnik nr 2");
                            int a2 = scanner.nextInt();
                            kalkulator.setLiczba2(a2);
                            double mnożenie = kalkulator.mnożenie();
                            System.out.println(a1 + " * " + a2 + " = " + mnożenie);
                            break;
                        case ("4"):
                            System.out.println("Podaj dzielną");
                            int b1 = scanner.nextInt();
                            kalkulator.setLiczba1(b1);
                            System.out.println("Podaj dzielnik nr 2");
                            int b2 = scanner.nextInt();
                            kalkulator.setLiczba2(b2);
                            if (b2 == 0) {
                                System.out.println("Nie poprawna wartość");
                            } else {
                                double dzielenie = kalkulator.dzielenie();
                                System.out.println(b1 + " / " + b2 + " = " + dzielenie);
                            }
                            break;
                        case ("5"):
                            System.out.println("Podaj liczbę podpierwiastkową");
                            int p1 = scanner.nextInt();
                            kalkulator.setLiczba1(p1);
                            double pierw = kalkulator.pierwiastek();
                            System.out.println("Pierwiastek z liczby " + p1 + " = " + pierw);
                            break;
                        case ("6"):
                            System.out.println("Podaj podstawę potęgi");
                            int aa1 = scanner.nextInt();
                            kalkulator.setLiczba1(aa1);
                            System.out.println("Podaj wykładnik potęgi");
                            int aa2 = scanner.nextInt();
                            kalkulator.setLiczba2(aa2);
                            double pot = kalkulator.potęgowanie();
                            System.out.println(aa1 + " * " + aa2 + " = " + pot);
                            break;
                        case ("quit"):
                            break;
                        default:
                            System.out.println();
                    }
                    break;
                case ("2"):
                    BMI bmi = new BMI();
                    System.out.println("Podaj masę ciała w kg");
                    double kg = scanner.nextDouble();
                    bmi.setWaga(kg);
                    System.out.println("Podaj wzrost w metrach");
                    double wzrost = scanner.nextDouble();
                    bmi.setWzrost(wzrost);
                    double BMI = bmi.obliczBMI();
                    if (BMI < 16) {
                        System.out.println("Wygłodzenie");
                    } else if (16 < BMI && BMI < 16.99) {
                        System.out.println("wychudzenie");
                    } else if (17 < BMI && BMI < 18.49) {
                        System.out.println("niedowaga");
                    } else if (18.5 < BMI && BMI < 24.99) {
                        System.out.println("pożądana masa ciała");
                    } else if (25 < BMI && BMI < 29.99) {
                        System.out.println("nadwaga");
                    } else if (30 < BMI && BMI < 34.99) {
                        System.out.println("otyłość I stopnia");
                    } else if (35 < BMI && BMI < 39.99) {
                        System.out.println("otyłość II stopnia (duża)");
                    } else if (40 < BMI) {
                        System.out.println("otyłość III stopnia (chorobliwa)");
                    }
                    break;
                case ("3"):
                    Silnia silnia = new Silnia();
                    System.out.println("Podaj liczbę całkowitą, której silnię mam obliczyć");
                    try {
                        int l = scanner.nextInt();
                        silnia.setLiczba(l);
                        System.out.println("Silnia twojej liczby to: " + silnia.obliczSilnia());
                    } catch (Exception e) {
                        System.out.println("Nie poprawna wartość");
                        break;
                    }
                    break;
                default:
                    System.out.println();

            }
            if (i.toLowerCase().equals("quit")) {
                break;
            }
        }
    }
}