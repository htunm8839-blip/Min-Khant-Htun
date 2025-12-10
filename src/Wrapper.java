public class Wrapper {

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


