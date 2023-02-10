package task5;

public class Guest {
    private String name;
    private String id;

    public Guest(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public Guest(Guest other){
        this(other.name, other.id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Guest other){
        return(id== other.id);
    }

    @Override
    public String toString() {
        return String.format("Guest Name: %s, Guest ID: %s",name,id);
    }
}
