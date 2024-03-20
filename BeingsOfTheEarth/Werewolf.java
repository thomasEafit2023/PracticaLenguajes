package BeingsOfTheEarth;

import LivingBeing.LivingBeing;

public class Werewolf extends LivingBeing implements EarthBeing {
    @Override
    public void respawn() {
        System.out.println("Werewolf respawning");
    }

    @Override
    public void reproduce() {
        System.out.println("Werewolf making love");
    }

    @Override
    public void grow() {
        System.out.println("Werewolf growing up");
    }

    @Override
    public void born() {
        System.out.println("A Werewolf has born");
    }

    @Override
    public void die() {
        System.out.println("A werewolf has died");
    }

    public void bite(){
        System.out.println("Biting a Human");
    }
}
