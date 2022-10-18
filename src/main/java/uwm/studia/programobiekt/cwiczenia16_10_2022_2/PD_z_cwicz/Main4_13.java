package uwm.studia.programobiekt.cwiczenia16_10_2022_2.PD_z_cwicz;

public class Main4_13 {

    public static void main(String[] args) {

        String tekst = "Kiedy idzie się po miód z balonikiem, " +
                "to trzeba się starać, żeby pszczoły nie wiedziały, " +
                "po co się idzie – odpowiedział Puchatek";
        int counter = 0;
        String[] s = tekst.split(" ");
        for (String s1 : s) {
            for (int i = 0; i < s.length; i++) {
                if (s1.equals(s[i])) {
                    counter++;
                    if (counter>1)
                    System.out.println("Słowo " + s1 + " występuje dokładnie: " + counter + " razy");
                }
            }
            counter = 0;
        }

    }
}
