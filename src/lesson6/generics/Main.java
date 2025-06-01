package lesson6.generics;

public class Main {
    public static void main(String[] args) {
        Gen<Integer> gen = new Gen<>();
        gen.setMyVar(486);
        gen.printGenericType();
        System.out.println(gen.getMyVar());

        Gen<String> gen2 = new Gen<>();
        gen2.setMyVar("some string");
        gen2.printGenericType();
        System.out.println(gen2.getMyVar());

        Stats<Double> doubleStats = new Stats<>();
        doubleStats.setValues(new Double[]{12., .5, 6.});
        System.out.println(doubleStats.average());

        Stats<Long> longStats = new Stats<>();
        longStats.setValues(new Long[]{4L, 9999999L, 2L});
        System.out.println(longStats.average());

        TwoGen<String, Integer> twoGen = new TwoGen<>();
        twoGen.setMyVarT("abcd");
        twoGen.setMyVarU(1234);

        System.out.println(GenMethod.isIn(new Object[]{"a", "b", "c"}, "b"));
    }
}
