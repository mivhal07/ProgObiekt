package uwm.studia.programobiekt.cwiczenia06_11_2022;

import java.util.Random;

public class Odcinek {

    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        Random random = new Random();
        int ran1 = random.nextInt(9);
        int rand1 = random.nextInt(9);
        int ran2 = random.nextInt(9);
        int rand2 = random.nextInt(9);
        int p11 = punkt.getX2()[ran1];
        int p12 = punkt.getY2()[ran2];
        int p21 = punkt.getX2()[rand1];
        int p22 = punkt.getY2()[rand2];
        int res1 = p11 - p21;
        int res2 = p12 - p22;
        double odl = Math.sqrt(Math.pow(res1, 2) + Math.pow(res2, 2));
        System.out.println(String.format("Odległość między tymi punktami: (%s,%s) i (%s,%s) wynosi: %s", p11, p12, p21, p22, odl));

    }
}
