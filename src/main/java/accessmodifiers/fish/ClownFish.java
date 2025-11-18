package accessmodifiers.fish;

public class ClownFish extends Fish {

    protected String name = "Clown";

    protected void swim() {
        System.out.println("I can swim ClownFish");
    }

    public static void main(String[] args) {
        new ClownFish().swim();
    }
}
