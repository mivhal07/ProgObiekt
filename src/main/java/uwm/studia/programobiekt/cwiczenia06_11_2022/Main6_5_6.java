package uwm.studia.programobiekt.cwiczenia06_11_2022;

public class Main6_5_6 {

    public static void main(String[] args) {
//        wyświetl();
//        przesuń(5, -10);
        wyświetl2();
        przesuń2(4,7);
    }

    public static void przesuń(int x2, int y2) {
        Punkt punkt = new Punkt();
        int x = punkt.getX();
        int y = punkt.getY();
        x += x2;
        y += y2;
        punkt.setX(x);
        punkt.setY(y);
        System.out.println("Przesunięty punkt ma współrzędne: (" + x + "," + y + ")");
    }

    public static void wyświetl() {
        Punkt punkt = new Punkt();
        int x = punkt.getX();
        int y = punkt.getY();
        System.out.println("Pierwotne współrzędne: (" + x + "," + y + ")");
    }

    public static void wyświetl2() {
        Punkt punkt = new Punkt();
        int[] x = punkt.getX2();
        int[] y = punkt.getY2();
        for (int i = 0; i < x.length; i++) {
            System.out.println("Współrzędne punktu: (" + x[i] + "," + y[i] + ")");
        }
    }

    public static void przesuń2(int x2, int y2) {
        Punkt punkt = new Punkt();
        int[] x = punkt.getX2();
        int[] y = punkt.getY2();
        for (int i = 0; i < x.length; i++) {
            x[i] += x2;
            y[i] += y2;
            System.out.println("Współrzędne punktu po przesunięciu o wektor: (" + x2 + "," + y2 + ") wynoszą: (" + x[i] + "," + y[i] + ")");
        }
    }
}
