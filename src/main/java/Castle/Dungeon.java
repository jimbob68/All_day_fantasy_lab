package Castle;

public class Dungeon extends Room {

    public Dungeon(String name) {
        super(name);
    }

    public int numberOfEnemies(){
        return this.enemies.size();
    }



}
