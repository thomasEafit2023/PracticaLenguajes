package BeingsOfTheEarth;

import LivingBeing.LivingBeing;

public class Lemur extends LivingBeing implements EarthBeing{
    @Override
    public void respawn() {
        System.out.println("Lemur respawning");
    }

    @Override
    public void reproduce() {
        System.out.println("Lemur making love");
    }

    @Override
    public void grow() {
        System.out.println("Lemur growing up");
    }

    @Override
    public void born() {
        System.out.println("A Lemur has born");
    }

    @Override
    public void die() {
        System.out.println("Lemur has died");
    }
}
