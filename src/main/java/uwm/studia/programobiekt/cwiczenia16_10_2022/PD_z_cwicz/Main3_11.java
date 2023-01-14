package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

public class Main3_11 {

    public static void main(String[] args) {
        int hundred = 0;
        int counter = 0;
        for (int i = 0; i < 50; i++) {
            counter++;
            hundred += i;
            if (hundred >= 100) {
                System.out.println(counter - 1);
                break;
            }
        }
    }
}
