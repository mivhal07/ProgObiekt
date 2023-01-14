package uwm.studia.kolokwium.kol14_01_2022;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SrodekLokomocji {
    protected int iloscMiejsc;
    protected double cenaBiletu;

    public SrodekLokomocji(){

    }

    public void obliczCene(){
        this.cenaBiletu=55;
    }

}
