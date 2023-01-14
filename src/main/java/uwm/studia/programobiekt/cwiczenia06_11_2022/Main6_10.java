package uwm.studia.programobiekt.cwiczenia06_11_2022;

public class Main6_10 {

    public static void main(String[] args) {
        KandydatNaStudia[] obj = new KandydatNaStudia[4];
        obj[0] = new KandydatNaStudia("Kowalski", 55, 42, 41);
        obj[1] = new KandydatNaStudia("Piłsudski", 83, 81, 83);
        obj[2] = new KandydatNaStudia("Nowak", 68, 86, 54);
        obj[3] = new KandydatNaStudia("Bigus", 99, 42, 77);
        for (KandydatNaStudia kandydatNaStudia : obj) {
            System.out.println(kandydatNaStudia.getNazwisko() + " - " + kandydatNaStudia.obliczPkt());
        }

    }
}