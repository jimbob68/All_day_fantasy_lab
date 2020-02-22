package mythicalBeasts;

import restorativePowers.IRestorable;

public class Unicorn extends MythicalBeast implements IRestorable {

    public Unicorn(String name, int strength, int restorativePower, int treasure) {
        super(name, strength, restorativePower, treasure);
    }
}
