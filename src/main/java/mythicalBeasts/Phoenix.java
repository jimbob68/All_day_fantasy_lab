package mythicalBeasts;

import restorativePowers.IRestorable;

public class Phoenix extends MythicalBeast implements IRestorable {

    public Phoenix(String name, int strength, String restorativePower, int treasure){
        super(name, strength, restorativePower, treasure);
    }
}
