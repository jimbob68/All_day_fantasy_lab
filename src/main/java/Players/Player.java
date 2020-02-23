package Players;

public abstract class Player {
     String name;
     int healingPoints;
     int treasure;
     int purse;
     int AttackStrength;
     int DefenceStrength;


    public Player(String name, int healingPoints, int treasure, int purse, int AttackStrength, int DefenceStrength){
        this.name = name;
        this.healingPoints = healingPoints;
        this.treasure = treasure;
        this.purse = purse;
        this.AttackStrength = AttackStrength;
        this.DefenceStrength = DefenceStrength;
    }

    public String getName(){
        return this.name;
    }

    public int getHealingPoints(){
        return this.healingPoints;
    }

    public int canGetTreasure(){
        return this.treasure;
    }

    public int canGetPurseTotal(){
        return this.purse;
    }

    public int canGetAttackStrengthValue(){
        return AttackStrength;
    }
    public int canGetDefenceStrength(){
        return this.DefenceStrength;
    }


}
