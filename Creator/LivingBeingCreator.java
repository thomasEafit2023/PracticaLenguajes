package Creator;

import BeingsOfTheEarth.Human;
import LivingBeing.LivingBeing;
import SkyBeings.Angel;
import SkyBeings.Bird;
import SkyBeings.Eagle;
import SkyBeings.Gargoyle;

import java.text.MessageFormat;

public class LivingBeingCreator implements Creator {
    public static LivingBeing createLivingBeing(TypeOfBeing type) throws ClassNotFoundException {
        switch (type){
            case HUMAN -> {return new Human();}
            case BIRD -> {return new Bird();}
            case ANGEL -> {return new Angel();}
            case EAGLE -> {return new Eagle();}
            case GARGOYLE -> {return new Gargoyle();}
            default -> {
                throw new ClassNotFoundException(MessageFormat.format("${0} class doesn't exist", type));
            }
        }
    }
}
