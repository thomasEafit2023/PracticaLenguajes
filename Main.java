import BeingsOfTheEarth.Human;
import Creator.LivingBeingCreator;
import Creator.TypeOfBeing;
import LivingBeing.LivingBeing;
import SkyBeings.Bird;
import SkyBeings.Gargoyle;

public class Main {
    public static void main(String[] args) {

        try{
            LivingBeing ser1 = LivingBeingCreator.createLivingBeing(TypeOfBeing.HUMAN);
            ((Human)ser1).fly();
            LivingBeing ser2 = LivingBeingCreator.createLivingBeing(TypeOfBeing.BIRD);
            ((Bird)ser2).land();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
