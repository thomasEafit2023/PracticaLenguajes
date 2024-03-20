package BeingsOfTheEarth;

import LivingBeing.LivingBeing;

public class Donkey extends LivingBeing implements EarthBeing {
    @Override
    public void respawn() {
        System.out.println("Donkey respawning");
    }

    @Override
    public void reproduce() {
        System.out.println("Donkey making love");
    }

    @Override
    public void grow() {
        System.out.println("Donkey Growing up");
    }

    @Override
    public void born() {
        System.out.println("A Donkey has born");
    }

    @Override
    public void die() {
        System.out.println("The Donkey has died");
    }

    public void eatGrass(){
        System.out.println("Donkey eating grass");
    }
}
