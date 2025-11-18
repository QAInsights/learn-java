package accessmodifiers.duck;

public class GoodDuck {
    public void makeNoise() {
        var md = new MotherDuck();
        System.out.println(md.name);
        md.noise();
    }
}
