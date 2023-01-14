package uwm.studia.programobiekt.cwiczenia26_11_2022.lista_na_cw_221126;

public class Main {

    public static void main(String[] args) {
//        student.obliczWiek();
        Student student1 = new Student("Michał", "Dobrzański", "2000", 2, 1, 156466);
        Student student2 = new Student("Klaudiusz", "Grzeszczyk", "2001", 2, 1, 173892);
        Osoba osoba1 = new Osoba("Jan", "Kowalski", "1986");
        Osoba osoba2 = new Osoba("Marek", "Nowak", "1994");
        try {
            student1 = (Student) osoba1;
            osoba2 = (Osoba) student2;
        }catch (ClassCastException e){
            e.getMessage();
        }
        System.out.println(student1.wypiszInfo().toString());
        System.out.println(osoba2.wypiszInfo().toString());
    }
}
