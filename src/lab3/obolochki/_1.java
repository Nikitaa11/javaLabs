package lab3.obolochki;

public class _1 {
    public static void main(String[] args) {
        int a = 10;
        float b = 2.423f;
        String c = "12";

        System.out.println("Возвращаемое значение(int): " + (double) a);
        System.out.println("Возвращаемое значение(float): " + (double) b);
        System.out.println("Возвращаемое значение(String)(parse): " + Double.parseDouble(c));
        System.out.println("Возвращаемое значение(String)(value): " + Double.valueOf(c));
        String d = Double.toString(3.14);
        System.out.println("Литерал типа double в строку " + d);
    }
}
