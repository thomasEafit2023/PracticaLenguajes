package SkyBeings;

import LivingBeing.LivingBeing;

public class Bird extends LivingBeing implements SkyBeing{
    @Override
    public void reproduce() {
        System.out.println("A bird is reproducing with another bird");
    }

    @Override
    public void grow() {
        System.out.println("The bird is growing up");
    }

    @Override
    public void born() {
        System.out.println("A new bird has born");
    }

    @Override
    public void die() {
        System.out.println("A bird has died");
    }

    @Override
    public void fly() {
        System.out.println("Bird flying by itself");
    }

    @Override
    public void land() {
        System.out.println("Bird landing");
    }
}
