package uwm.studia.programobiekt.cwiczenia06_11_2022;

public class Prostokat {
    private static double[] dlugosc = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static double[] szerokosc = {9, 8, 7, 6, 5, 4, 3, 2, 1};


    private static double[] powierzchnia() {
        double[] pow = new double[dlugosc.length];
        for (int i = 0; i < dlugosc.length; i++) {
            pow[i] = dlugosc[i] * szerokosc[i];
        }
        return pow;
    }

    private static double[] obwod() {
        double[] obw = new double[dlugosc.length];
        for (int i = 0; i < dlugosc.length; i++) {
            obw[i] = dlugosc[i] + szerokosc[i] + dlugosc[i] + szerokosc[i];
        }
        return obw;
    }

    public static void prezentuj() {
        double[] pow = powierzchnia();
        double[] obw = obwod();
        double maxPow = 0;
        for (int i = 0; i < pow.length; i++) {
            System.out.println("Wymiary prostokąta to: powierzchnia = " + pow[i] + " i obwód = " + obw[i]);
        }
        for (int i = 0; i < pow.length; i++) {
            if (pow[i] > maxPow) {
                maxPow = pow[i];
            }
        }
        System.out.println("Największa powierzchnia wynosi: " + maxPow);
    }
}
