package uwm.studia.programobiekt.cwiczenia09_10_2022.PD_z_cwicz;

public class Main2_8 {

    public static void main(String[] args) {
        // Odpowiedź a) x = true, y = 1, z = 2
        boolean x;
        int y = 1, z = 1;
        x = (y == 1 && z++ == 1);
        System.out.println(x + ", " + y + ", " + z);
    }
}
