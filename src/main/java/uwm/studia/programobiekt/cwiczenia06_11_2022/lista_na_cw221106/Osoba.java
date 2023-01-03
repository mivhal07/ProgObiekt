package uwm.studia.programobiekt.cwiczenia06_11_2022.lista_na_cw221106;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
public class Osoba {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;
    public int waga;
    public int wzrost;
    public boolean okulary;
    public Enum<Plec> plec;


}
