package estates;

public class Building extends Location {

    public int id;
    private String status = "(not started)";
    public static String projectStatus = "(none started)";

    public void setStatus(String status) {
        this.status = status;
        projectStatus = "Project has begun";
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return
        "Building {" +
        "id=" + id +
        ", status='" + status + '\'' +
        '}';
    }
    
}
