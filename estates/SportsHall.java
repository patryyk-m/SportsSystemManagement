package estates;

public class SportsHall {

    private String name;

    public void setName(String name) throws EmptyNameException { 
        if (name.isEmpty()) {
            throw new EmptyNameException();
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SportsHall(String name) {
        this.name = name;
    }

    public Building building;

    public String toString() {
        return
        "SportsHall {" +
        "name='" + name +
        "' 'building=" + building +
        '}';

    }
    
}
