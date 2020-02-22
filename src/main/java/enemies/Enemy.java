package enemies;

public abstract class Enemy {

    String name;
    int strength;
    int treasure;


    public Enemy(String name, int strength, int treasure){
        this.name = name;
        this.strength= strength;
        this.treasure = treasure;
    }

    public String getName(){
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getTreasure(){
        return this.treasure;
    }

}
