package uwm.studia.programobiekt.cwiczenia26_11_2022.lista_na_cw_221126.rzutowanie;

public class NextDerrivedClass extends DerrivedClass {

    public static void main(String[] args) {

        try {
            BaseClass myObj = new BaseClass();
            DerrivedClass derObj1 = (DerrivedClass) myObj;
            NextDerrivedClass nxtObj1 = (NextDerrivedClass) myObj;
            System.out.println(myObj.toString());
            System.out.println(derObj1.toString());
            System.out.println(nxtObj1.toString());
        } catch (ClassCastException e) {
            e.getMessage();
        }
    }
}
