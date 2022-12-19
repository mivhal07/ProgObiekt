package uwm.studia.programobiekt.cwiczenia06_11_2022.lista_na_cw221106;

public class program extends Car {

    public static void main(String[] args) {

        Car car = new Car();
//        car.setRok(2004);
//        car.setMarka("Volkswagen");
//
//        try (FileWriter fileWriter = new FileWriter("car.txt", true)) {
//            fileWriter.append(car.getMarka() + "\n");
//            fileWriter.append(car.getRok() + "\n");
//        } catch (IOException ex) {
//            System.out.println("Błąd zapisu do pliku.");
//        }
//
//        Car car1 = new Car();
//        car1.setMarka("Audi");
//        car1.setRok(1999);
//
//        System.out.println("Marka: " + car1.getMarka() + "; Rok: " + car1.getRok());
//
//        Car car2 = new Car();
//        car2.setMarka("Subaru");
//        car2.setRok(2006);
//
//        System.out.println("Marka: " + car2.getMarka() + "; Rok: " + car2.getRok());
//
//        System.out.println("car1=car2");
//        car1 = car2;
//        System.out.println("Marka: " + car1.getMarka() + "; Rok: " + car1.getRok());
    }

    private static double ObliczSpalanie(double dlugoscTrasy, Car car) {
        double spalanie1 = car.getSpalanie();
        return dlugoscTrasy * spalanie1;
    }

    private static double ObliczKosztPrzejazdu(Car car, double dlugoscTrasy, double cenaPaliwa) {
        double spalanie = ObliczSpalanie(dlugoscTrasy, car);
        double kosztPrzejazdu;
        return kosztPrzejazdu = spalanie * cenaPaliwa;
    }
}
