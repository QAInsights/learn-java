package accessmodifiers.duck;

import accessmodifiers.duck.MotherDuck;

public class BabySwan {
    void makeNoise() {
        var md = new MotherDuck();
        System.out.println(md.name);
        md.noise();
    }

}
