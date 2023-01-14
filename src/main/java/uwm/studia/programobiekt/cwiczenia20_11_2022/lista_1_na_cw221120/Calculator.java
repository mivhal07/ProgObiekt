package uwm.studia.programobiekt.cwiczenia20_11_2022.lista_1_na_cw221120;
//Ta klasa nie może być statyczna.
//Metody też jest prościej i przyjemniej, gdy są publiczne, zamiast statyczne
public class Calculator {
    public int dodawanie(int a, int b) {
        return a + b;
    }

    public int odejmowanie(int a, int b) {
        return a - b;
    }

    public double mnozenie(int a, int b) {
        return a * b;
    }

    public double dzielenie(int a, int b) {
        return a / b;
    }

    public double potegowanie(int a, int b) {
        return Math.pow(a, b);
    }

    public double pierwiastkowanie(int a, int b) {
        return Math.pow(a, 1 / b);
    }

}
