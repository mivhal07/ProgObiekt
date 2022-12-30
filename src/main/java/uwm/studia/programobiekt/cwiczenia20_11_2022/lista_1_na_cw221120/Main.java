package uwm.studia.programobiekt.cwiczenia20_11_2022.lista_1_na_cw221120;

public class Main {

    public static void main(String[] args) {
        Calculator cc = new Calculator();
        System.out.println("+");
        System.out.println(cc.dodawanie(1, 3));
        System.out.println("-");
        System.out.println(cc.odejmowanie(1, 3));
        System.out.println("*");
        System.out.println(cc.mnozenie(1, 3));
        System.out.println("/");
        System.out.println(cc.dzielenie(1, 3));
        System.out.println("^");
        System.out.println(cc.potegowanie(2, 3));
        System.out.println("/^");
        System.out.println(cc.pierwiastkowanie(2, 3));
    }
}
