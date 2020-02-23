public enum DefenceStrength {

    WEAK(10),
    MEDIUM(20),
    STRONG(30);

    private int value;

    DefenceStrength(int value){
        this.value = value;
    }

    public int getValue(){
       return value;
    }
}
