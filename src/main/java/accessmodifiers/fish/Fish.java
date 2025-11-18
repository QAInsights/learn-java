package accessmodifiers.fish;

public class Fish {
    protected String name = "fish";

    public Fish() {
        this.swim();
    }

    protected void swim() {
        System.out.println("I can swim - just fish");
    }
}
