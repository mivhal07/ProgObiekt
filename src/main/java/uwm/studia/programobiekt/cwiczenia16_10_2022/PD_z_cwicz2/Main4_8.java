package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz2;

public class Main4_8 {

    public static void main(String[] args) {

        String[][] tab1 = {{"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"},
                {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"},
                {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"}};

        for (int i = 0; i < tab1[0].length; i++) {
            for (int j = 0; j < tab1.length; j++) {
                if (j == 0) {
                    System.out.print("Dzień tygodnia: " + tab1[j][i]);
                } else if (j == 1) {
                    System.out.print(" " + tab1[j][i]);
                } else if (j == 2) {
                    System.out.println(" " + tab1[j][i]);
                }
            }
        }
    }
}
