public class Human1 {

    private String name;

    public String getName() {
        return name;
    }

    public Human1(String name) {
        this.name = name;
    }

    public static void showName(String name){
        System.out.println("Hello I am" + name);
    }
}
