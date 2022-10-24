package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz2;

public class Main4_12 {

    public static void main(String[] args) {
        String tekst = "W parę godzin później, gdy noc zbierała się do odejścia,\n" +
                "Puchatek obudził się nagle z uczuciem dziwnego przygnębienia.\n" +
                "To uczucie dziwnego przygnębienia miewał już nieraz i wiedział,\n" +
                "co ono oznacza. Był głodny. Więc poszedł do spiżarni,\n" +
                "wgramolił się na krzesełko, sięgnął na górną półkę, ale nic nie znalazł.";
        System.out.println(tekst);
        System.out.println("-----------------------------------");
        int counter = 0;
        String[] split = tekst.split("\n");
        System.out.println("Liczba wierszy: " + split.length);
        for (int i = 0; i < split.length; i++) {
            System.out.print("W " + (i + 1) + " wierszu jest: ");
            for (int j = 0; j < split[i].toCharArray().length; j++) {
                counter++;
            }
            System.out.println(counter + " znaków");
            counter = 0;
        }
    }
}
