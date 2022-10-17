package uwm.studia.programobiekt.cwiczenia16_10_2022.PD_z_cwicz;

public class Main3_15 {

    public static void main(String[] args) {
        for (int z1 = 0; z1 <= 10; z1++)
            for (int z2 = 0; z2 <= 5; z2++)
                for (int z5 = 0; z5 <= 2; z5++)
                    if (z1 + z2 * 2 + z5 * 5 == 10)
                        System.out.println("zlotowka = " + z1 + ", dwa zlote = " + z2 + ", piec zlote = " + z5);


    }
}
