package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

public class Main5_10 {

    //Zwróci 15;
    public static void main(String[] args) {

        int n = 5;
        System.out.println(Oblicz(5));
        ;
    }

    static int Oblicz(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + Oblicz(n - 1);
        }
    }
}
