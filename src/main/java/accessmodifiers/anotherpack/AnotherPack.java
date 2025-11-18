package accessmodifiers.anotherpack;

import accessmodifiers.fish.ClownFish;
import accessmodifiers.fish.Fish;

public class AnotherPack extends ClownFish {
    public void swimmer() {
        swim();

        AnotherPack ap = new AnotherPack();
        ap.swim();

        var f = new Fish();
//        f.swim(); // Doesn't compile

        ClownFish ap1 = new ClownFish();

//        System.out.println(ap1.name); // Doesn't compile

        ClownFish cc = new AnotherPack();
//        cc.swim(); Doesn't compile
    }
}
