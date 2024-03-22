package SkyBeings;
import BeingsOfTheEarth.EarthBeing;
import LivingBeing.LivingBeing;

public class Angel extends LivingBeing implements SkyBeing {
    @Override
    public void reproduce() {
        System.out.println("An angel is creating new life forms");
    }

    @Override
    public void grow() {
        System.out.println("The angel is nurturing growth");
    }

    @Override
    public void born() {
        System.out.println("A new angel has descended from the heavens");
    }

    @Override
    public void die() {
        System.out.println("An angel has returned to the celestial realm");
    }

    @Override
    public void fly() {
        System.out.println("Angel soaring through the skies");
    }

    @Override
    public void land() {
        System.out.println("Angel gracefully landing");
    }

    @Override
    public void changeDimension() {
        SkyBeing.super.changeDimension();
    }
}