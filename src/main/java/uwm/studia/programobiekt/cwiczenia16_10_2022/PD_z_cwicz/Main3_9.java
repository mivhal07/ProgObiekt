package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

import java.util.Scanner;

public class Main3_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz wariant, który chcesz zobaczyć a/b/c/d");
        char s = scanner.nextLine().toCharArray()[0];
        if (s == 'a') {
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
        } else if (s == 'b') {
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
        } else if (s == 'c') {
            System.out.println("   *");
            System.out.println("  **");
            System.out.println(" ***");
            System.out.println("****");
        } else if (s == 'd') {
            System.out.println("****");
            System.out.println("*  *");
            System.out.println("*  *");
            System.out.println("****");
        } else {
            System.out.println("Nie prawidłowa wartość");
        }
    }
}
