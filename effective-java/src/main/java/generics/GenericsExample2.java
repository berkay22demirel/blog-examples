package generics;

public class GenericsExample2 {

    public static void main(String[] args) {
        add(5, 5.2);
    }

    private static <T, E extends Number> void add(E param1, E param2) {
        Number a = param1.doubleValue() + param2.doubleValue();
        System.out.println(a);      //10.2
    }
}
