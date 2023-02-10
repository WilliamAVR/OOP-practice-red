package task5;

public class Hotel {
    private Room[] roomList;
    private String hotelName;
    private int starRating = 1;

    public Hotel(Room[] roomList, String hotelName, int starRating) {
        this.roomList = roomList;
        this.hotelName = hotelName;
        if (starRating > 0 && starRating < 6) {
            this.starRating = starRating;
        }
    }
    public boolean hasGuest(Guest guest){
        for (Room room:roomList) {
            if(room.hasGuest(guest)){
                return true;
            }
        }
        return false;
    }
    public boolean book(Guest guest, String roomName){
        if(this.hasGuest(guest)){
            return false;
        }
        for (Room room:roomList) {
            if(room.getRoomName()==roomName){
                return room.addGuest(guest);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", starRating=" + starRating +
                '}';
    }
    public String printRoomGuests(String roomName){
        for (Room room:
             roomList) {
            if(room.getRoomName()==roomName){
                return room.returnGuestList();
            }
        }
        return "";
    }
}
