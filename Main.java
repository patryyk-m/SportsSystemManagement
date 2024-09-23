import activity.Competition;
import activity.LevelType;
import estates.Building;
import estates.EmptyNameException;
import estates.SportsHall;


public class Main
{
    public static void main(String[] args) {
        System.out.println(Building.projectStatus);

        Building cBlock = new Building();
        cBlock.id = 1;
        cBlock.setStatus("completed");
        System.out.println(cBlock);

        System.out.println(Building.projectStatus);

        SportsHall cBlockSportsHall = new SportsHall("Blanch sports hall");
        cBlockSportsHall.building = cBlock;
        System.out.println(cBlockSportsHall);

        Competition womensBasketballLeague = new Competition();
        womensBasketballLeague.setTitle("Women's basketball");
        womensBasketballLeague.setAddress("TU Dublin, Blanchardstown");
        womensBasketballLeague.setLevel(LevelType.LOCAL);
        womensBasketballLeague.hall = cBlockSportsHall;
        System.out.println(womensBasketballLeague);

        try {
            System.out.println("EXCEPTION TEST: cBlockSportsHall.setName(\"\");");
            cBlockSportsHall.setName("");
        } catch (EmptyNameException e){
            System.out.println("EmptyNameException occurred");
        } catch (Exception e){
            System.out.println("Exception occurred = " + e.getMessage());
        }

        try {
            System.out.println("EXCEPTION TEST: womensBasketballLeague.setTitle(\"aa\");");
            womensBasketballLeague.setTitle("aa");
        } catch (EmptyNameException e){
            System.out.println("EmptyNameException occurred");
        } catch (Exception e){
            System.out.println("Exception occurred = " + e.getMessage());
        }

        
    }
}
