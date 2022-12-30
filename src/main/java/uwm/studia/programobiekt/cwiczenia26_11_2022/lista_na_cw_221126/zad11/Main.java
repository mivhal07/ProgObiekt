package uwm.studia.programobiekt.cwiczenia26_11_2022.lista_na_cw_221126.zad11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Konto konto1 = new Konto(49176183, 5917, "Michał", "Dobrzański", 1943, 381823249, "2022-12-30", LocalDateTime.now());
        Konto konto2 = new Konto(49136718, 4491, "Jan", "Nowak", 119, 297381994, "2022-05-10", LocalDateTime.now());
        Konto konto3 = new Konto(77194863, 1196, "Adam", "Chrobrewicz", 493481, 994613849, "2022-01-27", LocalDateTime.now());
        Konto konto4 = new Konto(59184631, 4746, "Grzegorz", "Pstryk", 4918, 471694557, "2022-11-09", LocalDateTime.now());
        try {
            PrintWriter out1 = new PrintWriter("tekst1.txt");
            out1.println(konto1);
            out1.close();
            PrintWriter out2 = new PrintWriter("tekst2.txt");
            out2.println(konto2);
            out2.close();
            PrintWriter out3 = new PrintWriter("tekst3.txt");
            out3.println(konto3);
            out3.close();
            PrintWriter out4 = new PrintWriter("tekst4.txt");
            out4.println(konto4);
            out4.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
