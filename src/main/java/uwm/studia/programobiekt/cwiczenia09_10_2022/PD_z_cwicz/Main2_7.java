package uwm.studia.programobiekt.cwiczenia09_10_2022.PD_z_cwicz;

public class Main2_7 {

    public static void main(String[] args) {
        // Odpowiedź: Wyświetli się 7.
        int x, y = 5;
        x = ++y * 2;
        x = y++;
        x = y--;
        System.out.println(++y);
    }
}
