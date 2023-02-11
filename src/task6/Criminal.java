package task6;

public class Criminal extends Player{
    public Criminal(String name, int strength) {
        super(name, strength);
    }
    public Criminal(Criminal other){
        this(other.getName(),other.getStrength());
    }
}
