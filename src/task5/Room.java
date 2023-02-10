package task5;

public class Room {
    private Guest[] guestList;
    private int guestCapacity;
    private int guestNumber = 0;
    private String roomName;
    private double roomCost;

    public Room(int guestCapacity, String roomName, double roomCost) {
        this.guestCapacity = Math.abs(guestCapacity);
        this.roomName = roomName;
        this.roomCost = Math.abs(roomCost);
        guestList = new Guest[guestCapacity];
    }

    public Room(Room other) {
        this(other.guestCapacity, other.roomName, other.roomCost);
    }

    public boolean isFull() {
        return (guestNumber == guestCapacity);
    }

    public boolean addGuest(Guest guest) {
        if (guestNumber >= guestCapacity) {
            return false;
        }
        guestList[guestNumber] = guest;
        guestNumber++;
        return true;
    }
    public boolean hasGuest(Guest guest){
        for (int i = 0; i < guestNumber; i++) {
            if(guestList[i].equals(guest)){
                return true;
            }
        }
        return false;
    }

    public String getRoomName() {
        return roomName;
    }

    @Override
    public String toString() {
        return String.format("Room: %s, capacity: %d, cost: %.2f",roomName,guestCapacity,roomCost);
    }
    public String returnGuestList(){
        String str="";
        for (int i = 0; i < guestNumber; i++) {
            str+=guestList[i].getName()+" | ";
        }
        return str;
    }
}
