package task6;

public class App {
    public static void main(String[] args) {
        Criminal c1 = new Criminal("John",5);
        Criminal c2 = new Criminal("Jim",3);
        Criminal c3 = new Criminal("James",1);
        Criminal c4 = new Criminal(c1);
        Policeman p1 = new Policeman("Jared",9);
        p1.arrest(c1);
        p1.arrest(c2);
        p1.arrest(c3);
        p1.arrest(c4);
        p1.showArrestedCriminals();
    }
}
