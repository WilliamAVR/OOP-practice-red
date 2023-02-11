package task6;

public abstract class Player {
    private String name;
    private int strength;

    public Player(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
    protected boolean isAlive(){
        return(strength>0);
    }
    protected int knockOut(){
        int a = strength;
        strength = 0;
        return a;
    }

    protected String getName() {
        return name;
    }

    protected int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return String.format("%s : %d",name,strength);
    }
}
