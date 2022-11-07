package uwm.studia.programobiekt.cwiczenia06_11_2022;

public class Prostopadloscian {
    private static double dlugosc = 4;
    private static double szerokosc = 7;
    private static double wysokosc = 14;

    public static void main(String[] args) {
        double v = dlugosc * szerokosc * wysokosc;
        double v1 = 15 * 3 * 7;
        System.out.println("Objętość prostopadłościanu wynosi: " + v);
        porownaj(v, v1);
    }

    public static void porownaj(double v1, double v2) {
        if (v1 > v2) {
            double result = v1 - v2;
            System.out.println("Prostopadłościan nr1 jest większy objętościowo od prostopadłościanu nr2 o " + result);
        } else if (v2 > v1) {
            double result = v2 - v1;
            System.out.println("Prostopadłościan nr2 jest większy objętościowo od prostopadłościanu nr1 o " + result);
        } else {
            System.out.println("Prostopadłościany są równe");
        }
    }
}
