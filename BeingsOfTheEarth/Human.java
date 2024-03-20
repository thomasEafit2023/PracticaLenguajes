package BeingsOfTheEarth;
import LivingBeing.LivingBeing;
import SkyBeings.SkyBeing;

public class Human extends LivingBeing implements EarthBeing, SkyBeing {

    @Override
    public void reproduce() {
        System.out.println("Human making love");
    }

    @Override
    public void grow() {
        System.out.println("The Human is growing up");
    }

    @Override
    public void born() {
        System.out.println("A Human has born");
    }

    @Override
    public void die() {
        System.out.println("A Human has died");
    }

    @Override
    public void respawn() {
        System.out.println("A Human has respawned");
    }

    @Override
    public void fly() {
        System.out.println("Human flying through an airplane");
    }

    @Override
    public void land() {
        System.out.println("Human landing through an airplane");
    }
}
