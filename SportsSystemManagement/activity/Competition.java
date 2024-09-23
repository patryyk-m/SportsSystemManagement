package activity;

import estates.SportsHall;

public final class Competition {

    private String title;
    private String address;
    private LevelType level = LevelType.LOCAL;

    public void setTitle(String title) throws RuntimeException {
        if (title.length() <3) {
            throw new RuntimeException("Title must have at least 3 characters");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setLevel(LevelType level) {
        this.level = level;
    }

    public LevelType getLevel() {
        return level;
    }

    public SportsHall hall;

    public String toString() {
        return
        "Competition {" +
        "title='" + title +
        ", address='" + address +
        ", level=" + level +
        " \n" +
        "  hall=" + hall +
        '}';

    }
    
}
