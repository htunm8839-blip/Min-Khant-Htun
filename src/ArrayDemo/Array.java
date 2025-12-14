package ArrayDemo;

public class Array {

    public static void main(String[] args) {

        String[] array= {"hello","java","world"};

        for(int i=2; i>=0;i--) {
            System.out.println(array[array.length -(i+1)]);
        }
    }
}
