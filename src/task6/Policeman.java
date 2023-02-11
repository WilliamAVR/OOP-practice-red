package task6;

public class Policeman extends Player{
    private Criminal[] arrestedCriminals;
    private int totalArrested = 0;
    private int MAX_NUM_CRIMINALS = 3;

    public Policeman(String name, int strength) {
        super(name, strength);
        arrestedCriminals = new Criminal[MAX_NUM_CRIMINALS];
    }
    public boolean arrestedAll(){
        return(totalArrested>MAX_NUM_CRIMINALS);
    }
    public boolean arrest(Criminal criminal){
        if(isAlive() && criminal.isAlive()){
            if(!arrestedAll()){
                if(getStrength()>criminal.getStrength()){
                    setStrength(getStrength()-criminal.knockOut());
                    arrestedCriminals[totalArrested]=criminal;
                    totalArrested++;
                    return true;
                }else if(criminal.getStrength()>getStrength()){
                    criminal.setStrength(criminal.getStrength()-knockOut());
                }else{
                    criminal.knockOut();
                    knockOut();
                }
            }
        }
        return false;
    }
    public void showArrestedCriminals(){
        for (int i = 0; i < totalArrested; i++) {
            System.out.printf("%s |",arrestedCriminals[i]);
        }
        System.out.println();
    }
}
