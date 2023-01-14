package uwm.studia.programobiekt.cwiczenia20_11_2022.lista_1_na_cw221120;

public class Wyjątki {

    public static void main(String[] args) {
        int liczba1;
        int liczba2 = 2;
        int liczba3 = 2;
        int[] tab = new int[2];
        try {
            tab[25] = 2;
            // liczba1 = liczba2 / liczba3;
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        } //catch ()
         /* catch (ArithmeticException e) {
            e.getMessage();
        }/*finally {
            System.out.println("FINALLY");
        }*/
    } //tak!
}

