package Players;

import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import specialPowers.IWeaponable;

import java.util.ArrayList;

public class Knight extends Player {

    ArrayList<IWeaponable> weapons;
    public Knight(String name, int healingPoints, int treasure, int purse, int AttackStrength, int DefenceStrength){
        super(name, healingPoints, treasure, purse, AttackStrength, DefenceStrength);
        this.weapons = new ArrayList<IWeaponable>();
    }

    public int weaponCount(){
        return weapons.size();
    }

    public void addSword(Sword sword) {
        weapons.add(sword);
    }

    public void addAxe(Axe axe){
        weapons.add(axe);
    }

    public void addBow(Bow bow) {
        weapons.add(bow);
    }


}
