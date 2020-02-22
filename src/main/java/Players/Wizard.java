package Players;

import Weapons.Bow;
import Weapons.Wand;
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

    public void canAddWand(Wand wand){
        weapons.add(wand);
    }

    public void canAddBow(Bow bow){
        weapons.add(bow);
    }


}
