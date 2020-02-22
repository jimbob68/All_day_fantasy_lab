package mythicalBeasts;

import restorativePowers.IRestorable;

public class Dragon extends MythicalBeast implements IRestorable {

    public Dragon(String name, int strength, int restorativePower, int treasure){
        super(name, strength, restorativePower, treasure);
    }
}
