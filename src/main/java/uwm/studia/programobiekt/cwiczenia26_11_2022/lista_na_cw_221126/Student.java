package uwm.studia.programobiekt.cwiczenia26_11_2022.lista_na_cw_221126;

public class Student extends Osoba{
    public int rok;
    public int nrGrupy;
    public int nrAlbumu;

    public Student(String imie, String nazwisko, String rokUrodzenia, int rok, int nrGrupy, int nrAlbumu) {
        super(imie, nazwisko, rokUrodzenia);
        this.rok = rok;
        this.nrGrupy = nrGrupy;
        this.nrAlbumu = nrAlbumu;
    }

    @Override
    public String wypiszInfo() {
        return "Student{" +
                "rok=" + rok +
                ", nrGrupy=" + nrGrupy +
                ", nrAlbumu=" + nrAlbumu +
                '}';
    }
}
