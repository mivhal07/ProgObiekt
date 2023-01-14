package uwm.studia.programobiekt.cwiczenia09_10_2022.PD_z_cwicz;

public class Main2_6 {

    public static void main(String[] args) {
        //Odpowiedź: zmienna x, po wykonaniu poniższych instrukcji, będzie miała wartość 3.
        int x, y = 4;
        x = (y -= 2);
        x = y++;
        x = y--;
    }
}
