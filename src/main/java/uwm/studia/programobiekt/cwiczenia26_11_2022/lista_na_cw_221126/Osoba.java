package uwm.studia.programobiekt.cwiczenia26_11_2022.lista_na_cw_221126;

import java.time.LocalDate;

public class Osoba {
    protected static String imie;
    protected static String nazwisko;
    protected static String rokUrodzenia;

    protected Osoba(String imie, String nazwisko, String rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    protected void obliczWiek() {
        int substring = Integer.parseInt(rokUrodzenia.substring(2));
        int now = Integer.parseInt(LocalDate.now().toString().substring(2, 4));
        if (Integer.parseInt(rokUrodzenia) < 2000 && Integer.parseInt(rokUrodzenia) >= 1900) {
            now += 100;
            wiek(substring, now);
        } else if (Integer.parseInt(rokUrodzenia) >= 2000 && Integer.parseInt(rokUrodzenia) <= now + 2000) {
            wiek(substring, now);
        } else {
            System.out.println("Nie poprawna wartość roku urodzenia");
        }
    }

    protected String wypiszInfo() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }

    public void wiek(int substring, int now) {
        int wiek = now - substring;
        if (wiek == 0 || wiek >= 5) {
            System.out.println("Masz " + wiek + " lat");
        } else if (wiek == 1) {
            System.out.println("Masz " + wiek + " rok");
        } else {
            System.out.println("Masz " + wiek + " lata");
        }
    }
}