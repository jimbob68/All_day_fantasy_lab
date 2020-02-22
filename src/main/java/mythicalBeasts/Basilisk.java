package mythicalBeasts;

import restorativePowers.IRestorable;

public class Basilisk extends MythicalBeast implements IRestorable {

    public Basilisk(String name, int strength, int restorativePower, int treasure){
        super(name, strength, restorativePower, treasure);
    }
}
