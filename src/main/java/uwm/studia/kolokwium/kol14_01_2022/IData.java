package uwm.studia.kolokwium.kol14_01_2022;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class IData {

    public void ustawDate(LocalDateTime data) {
        Podroz podroz = new Podroz();
        data = LocalDateTime.now();
        podroz.setDataPodrozy(data);
    }

    public boolean sprawdzDate() {
        Podroz podroz = new Podroz();
        LocalDateTime dataPodrozy = podroz.getDataPodrozy();
        LocalDateTime dataTeraz=LocalDateTime.now();
        Duration duration = Duration.between(dataPodrozy,dataTeraz);
        if (duration.isNegative()) {
            return false;
        }else {
            return true;
        }
    }
}
