package uwm.studia.programobiekt.cwiczenia23_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main5_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Który element ciągu Fibonacciego chcesz obliczyć: ");
        int n = sc.nextInt();
        System.out.println(n + "-ty element ciągu Fibonacciego (rekurencja) wynosi: " + fibR(n));
        System.out.println(n + "-ty element ciągu Fibonacciego (iteracja) wynosi: " + fibI(n));
    }

    public static int fibR(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibR(n - 1) + fibR(n - 2);
        }
    }

    public static int fibI(int n) {
        int elementA = 0;
        int elementB = 1;
        int wynik = 0;
        if (n < 2) return n;
        for (int i = 2; i <= n; i++) {
            wynik = elementA + elementB;
            elementA = elementB;
            elementB = wynik;
        }
        return wynik;
    }
}
