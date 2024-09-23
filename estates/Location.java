package estates;

public abstract class Location {

    protected String eirCode;

    public void setEirCode(String eirCode){
        this.eirCode = eirCode;
    }

    public String getEirCode(){
        return this.eirCode;
    }
    
}
