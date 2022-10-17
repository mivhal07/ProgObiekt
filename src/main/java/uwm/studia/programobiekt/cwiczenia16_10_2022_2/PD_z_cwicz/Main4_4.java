package uwm.studia.programobiekt.cwiczenia16_10_2022_2.PD_z_cwicz;

import org.apache.commons.math3.primes.Primes;

import java.util.LinkedList;
import java.util.Random;

public class Main4_4 {

    public static void main(String[] args) {
        int counter = 0;
        Random random = new Random(999);
        LinkedList list = new LinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(999));
        }
        System.out.println(list);

        for (Object o : list) {
            if (Primes.isPrime(Integer.parseInt((String) o)) == true) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
