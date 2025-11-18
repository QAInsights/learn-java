package accessmodifiers.duck;

public class DuckDriver {
    public static void main(String[] args) {
        Duck d = new Duck();
//        System.out.println(d.name); // Does not compile
//        System.out.println(d.noise()); // Does not compile because of private in Duck
    }
}
