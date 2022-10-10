package uwm.studia.programobiekt.cwiczenia09_10_2022.PD_z_cwicz;

public class Main2_9 {

    public static void main(String[] args) {
        //a) wynik=false x=2 y=4 z=2
        a();

        //b) wynik=false x=2 y=5 z=2
        b();

        //c) wynik=false x=2 y=5 z=1
        c();

        //d) wynik=true x=1 y=3 z=4
        d();

        //e) wynik=true x=1 y=4 z=4
        e();

        //f) wynik=true x=1 y=4 z=5
        f();
    }

    public static void a() {
        int x = 1, y = 4, z = 2;
        boolean wynik = (x++ > 1 && y++ == 4 && z-- > 0);
        System.out.println(String.format("wynik=%s x=%s y=%s z=%s", wynik, x, y, z));
    }

    public static void b() {
        int x = 1, y = 4, z = 2;
        boolean wynik = (x++ > 1 & y++ == 4 && z-- > 0);
        System.out.println(String.format("wynik=%s x=%s y=%s z=%s", wynik, x, y, z));
    }

    public static void c() {
        int x = 1, y = 4, z = 2;
        boolean wynik = (x++ > 1 & y++ == 4 & z-- > 0);
        System.out.println(String.format("wynik=%s x=%s y=%s z=%s", wynik, x, y, z));
    }

    public static void d() {
        int x = 1, y = 3, z = 4;
        boolean wynik = (x == 1 || y++ > 2 || ++z > 0);
        System.out.println(String.format("wynik=%s x=%s y=%s z=%s", wynik, x, y, z));
    }

    public static void e() {
        int x = 1, y = 3, z = 4;
        boolean wynik = (x == 1 | y++ > 2 || ++z > 0);
        System.out.println(String.format("wynik=%s x=%s y=%s z=%s", wynik, x, y, z));
    }

    public static void f() {
        int x = 1, y = 3, z = 4;
        boolean wynik = (x == 1 | y++ > 2 | ++z > 0);
        System.out.println(String.format("wynik=%s x=%s y=%s z=%s", wynik, x, y, z));
    }
}
