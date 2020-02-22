package Players;

public abstract class Player {
     String name;
     int healingPoints;
     int treasure;
     int purse;


    public Player(String name, int healingPoints, int treasure, int purse){
        this.name = name;
        this.healingPoints = healingPoints;
        this.treasure = treasure;
        this.purse = purse;
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


}
