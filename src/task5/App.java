package task5;

public class App {
    public static void main(String[] args) {
        Guest g1 = new Guest("John Smith","123456");
        Guest g2 = new Guest(g1);
        Guest g3 = new Guest("Al Yankovik","042069");
        Guest g4 = new Guest("Kelvin Celsius","989755");
        Room r1 = new Room(4,"101",149.90);
        Room r2 = new Room(2,"102",79.90);
        Room[] rList = {r1,r2};
        Hotel h1 = new Hotel(rList,"St. Johns",6);
        System.out.println(h1.book(g1,"102"));
        System.out.println(h1.book(g3,"102"));
        System.out.println(h1.book(g4,"102"));

        System.out.println((h1.printRoomGuests("102")));

    }
}
