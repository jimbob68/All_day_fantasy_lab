package mythicalBeasts;

public abstract class MythicalBeast {

    String name;
    int strength;
    String restorativePower;
    int treasure;

    public MythicalBeast(String name, int strength, String restorativePower, int treasure){
        this.name = name;
        this.strength = strength;
        this.restorativePower = restorativePower;
        this.treasure = treasure;
    }

    public String getName() {
        return this.name;
    }

    public int getStrength() {
        return this.strength;
    }

    public String getRestorativePower() {
        return this.restorativePower;
    }

    public int getTreasure() {
        return this.treasure;
    }
}
