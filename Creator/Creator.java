package Creator;

import LivingBeing.LivingBeing;
public interface Creator {
    LivingBeing createLivingBeing(TypeOfBeing type) throws ClassNotFoundException;
}
