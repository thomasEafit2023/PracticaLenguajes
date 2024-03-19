package Creator;

import BeingsOfTheEarth.EarthBeing;
import BeingsOfTheEarth.Human;
import LivingBeing.LivingBeing;
import SkyBeings.SkyBeing;

import java.text.MessageFormat;

public interface Creator {
    public LivingBeing createLivingBeing(TypeOfBeing type);

}
