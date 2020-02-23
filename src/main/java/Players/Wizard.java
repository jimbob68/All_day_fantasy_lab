package Players;

import Weapons.Bow;
import Weapons.Wand;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Wizard extends Player implements IWeaponable {
    ArrayList<IWeaponable> weapons;

    public Wizard(String name, int healingPoints, int treasure, int purse, int AttackStrength, int DefenceStrength){
       super(name, healingPoints, treasure, purse, AttackStrength, DefenceStrength);
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
