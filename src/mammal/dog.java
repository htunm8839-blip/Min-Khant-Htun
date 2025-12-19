package mammal;

public class dog {

    private String name;

    private int age;

    int tail =0;

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class main {

        public static void main(String[] args) {
            int a = 10;
            int b = 13;
            int result1 = Integer.compare(a, b);
            System.out.println(result1);
            Integer c = a;
            Integer d = b;
            int result2 = c.compareTo(d);
            System.out.println(result2);
        }
    }
}
