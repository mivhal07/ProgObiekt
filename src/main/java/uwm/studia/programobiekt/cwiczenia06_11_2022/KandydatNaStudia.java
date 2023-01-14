package uwm.studia.programobiekt.cwiczenia06_11_2022;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class KandydatNaStudia {
    private String nazwisko;
    private int pktMat;
    private int pktInf;
    private int pktJezObc;

    public double obliczPkt() {
        return pktMat * 0.6 + pktInf * 0.5 + pktJezObc * 0.2;
    }
}
