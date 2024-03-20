package Creator;

import BeingsOfTheEarth.EarthBeing;
import BeingsOfTheEarth.Human;
import LivingBeing.LivingBeing;
import SkyBeings.Bird;
import SkyBeings.SkyBeing;

import java.text.MessageFormat;

public interface Creator {
    public static LivingBeing createLivingBeing(TypeOfBeing type) throws ClassNotFoundException{
        switch (type){
            case HUMAN -> {return new Human();}
            case BIRD -> {return new Bird();}
            default -> {
                throw new ClassNotFoundException(MessageFormat.format("${0} class doesn't exist", type));
            }
        }
    };

}
