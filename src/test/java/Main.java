public class Main {

    public static byte byteMaxVal = Byte.MAX_VALUE;
    public static int intMaxVal = Integer.MAX_VALUE;
    public static double doubleMaxVal = Double.MAX_VALUE;

    public static void main(String[] args) {

        // Простые операторы
        int a = 5;
        int b = 8;
        int c = -10;
        int d = -20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("b--   = " + (a--));

        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

        System.out.println("\n Переполнение типов данных" + ":");
        System.out.println(" - Результат переполнения byte: " + (byte) (byteMaxVal + 3));
        System.out.println(" - Результат переполнения int: " + (intMaxVal + 3));
        System.out.println(" - Результат переполнения double: " + (doubleMaxVal + 4.3D));

        double e = 2.3;
        int r = 3;
        System.out.println("Result: " + e + r);
        System.out.println("Result: " + (e + r));

        boolean result = a > b;
        System.out.println("a > b:  " + result);

        boolean result1 = a < b;
        System.out.println("a < b:  " + result1);

        boolean result2 = a == b;
        System.out.println("a = b:  " + result2);

        boolean result3 = a != b;
        System.out.println("a != b:  " + result3);
    }
}
