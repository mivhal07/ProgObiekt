package uwm.studia.kolokwium.kol14_01_2022;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Podroz {
    private LocalDateTime dataPodrozy;
    private List<SrodekLokomocji> planPodrozy=new ArrayList<>();
    private double kosztPodrozy = 0;

    public void dodajAutobus(int miejsca) {
        Autobus autobus = new Autobus(miejsca);
        try {
            this.planPodrozy.add(autobus);
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    public void dodajPociag(int miejsca, int dlugoscTrasy) {
        Pociag pociag = new Pociag(miejsca, dlugoscTrasy);
            planPodrozy.add(pociag);

    }

    public void usunOstatni() {
        planPodrozy.remove(this.planPodrozy.size() - 1);
    }

    public void wyczysc() {
        planPodrozy.clear();
    }

    public void ustawDate(LocalDateTime dataPodrozy){
        setDataPodrozy(dataPodrozy);
    }

    @Override
    public String toString() {
        return "Podroz{" +
                "dataPodrozy=" + dataPodrozy +
                ", planPodrozy=" + planPodrozy +
                ", kosztPodrozy=" + kosztPodrozy +
                '}';
    }
}
