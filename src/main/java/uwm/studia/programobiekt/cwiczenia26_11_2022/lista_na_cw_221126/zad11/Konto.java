package uwm.studia.programobiekt.cwiczenia26_11_2022.lista_na_cw_221126.zad11;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
public class Konto {
    private int login;
    private int pin;
    public String imieWlasciciela;
    public String nazwiskoWlasciciela;
    private int saldo;
    public long nrKonta;
    public LocalDate dataUtworzenia;
    private LocalDateTime czasOperacji;

    public Konto(int login, int pin, String imieWlasciciela, String nazwiskoWlasciciela, int saldo, long nrKonta, String dataUtworzenia, LocalDateTime czasOperacji) {
        this.login = login;
        this.pin = pin;
        this.imieWlasciciela = imieWlasciciela;
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
        this.saldo = saldo;
        this.nrKonta = nrKonta;
        this.dataUtworzenia = LocalDate.parse(dataUtworzenia);
        this.czasOperacji = czasOperacji;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "login=" + login +
                ", pin=" + pin +
                ", imieWlasciciela='" + imieWlasciciela + '\'' +
                ", nazwiskoWlasciciela='" + nazwiskoWlasciciela + '\'' +
                ", saldo=" + saldo +
                ", nrKonta=" + nrKonta +
                ", dataUtworzenia=" + dataUtworzenia +
                ", czasOperacji=" + czasOperacji +
                '}';
    }
}
