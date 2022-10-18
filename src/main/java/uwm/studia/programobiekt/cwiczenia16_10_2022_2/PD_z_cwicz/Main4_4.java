package uwm.studia.programobiekt.cwiczenia16_10_2022_2.PD_z_cwicz;

import org.apache.commons.math3.primes.Primes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main4_4 {

    public static void main(String[] args) {
        int counter = 0;
        Random random = new Random(999);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(999));
        }

        for (int o : list) {
            if (Primes.isPrime(o) == true) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
