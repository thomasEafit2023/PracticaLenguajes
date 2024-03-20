package SkyBeings;

import LivingBeing.LivingBeing;

public class Eagle extends LivingBeing implements SkyBeing {
    @Override
    public void reproduce() {
        System.out.println("An eagle is hatching new eaglets");
    }

    @Override
    public void grow() {
        System.out.println("The eagle is growing stronger and more majestic");
    }

    @Override
    public void born() {
        System.out.println("A young eagle breaks free from its shell");
    }

    @Override
    public void die() {
        System.out.println("An eagle has ascended to the skies forever");
    }

    @Override
    public void fly() {
        System.out.println("Eagle soaring high above the clouds");
    }

    @Override
    public void land() {
        System.out.println("Eagle landing gracefully on a lofty perch");
    }
}

