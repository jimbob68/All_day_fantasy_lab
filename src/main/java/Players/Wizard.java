package Players;

import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Wizard extends Player implements IWeaponable {
    ArrayList<IWeaponable> weapons;

    public Wizard(String name, int healingPoints){
       super(name, healingPoints);
       this.weapons = new ArrayList<IWeaponable>();
    }
    public int weaponCount(){
        return this.weapons.size();
    }

}
