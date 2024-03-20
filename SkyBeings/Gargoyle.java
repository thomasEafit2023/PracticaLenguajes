package SkyBeings;

import LivingBeing.LivingBeing;

public class Gargoyle extends LivingBeing implements SkyBeing {
    @Override
    public void reproduce() {
        System.out.println("A gargoyle is creating new gargoyle offspring");
    }

    @Override
    public void grow() {
        System.out.println("The gargoyle is slowly maturing");
    }

    @Override
    public void born() {
        System.out.println("A new gargoyle has emerged from its stone slumber");
    }

    @Override
    public void die() {
        System.out.println("A gargoyle has turned back into stone");
    }

    @Override
    public void fly() {
        System.out.println("Gargoyle gliding through the night");
    }

    @Override
    public void land() {
        System.out.println("Gargoyle landing on its perch");
    }

    @Override
    public void changeDimension() {
        SkyBeing.super.changeDimension();
    }
}
