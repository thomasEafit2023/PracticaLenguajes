package BeingsOfTheEarth;
import LivingBeing.LivingBeing;
import SkyBeings.SkyBeing;


/* La clase Human extiende de la clase abstracta LivingBeing e implementa las interfaces EarthBeing y SkyBeing
para que sea la unica clase perteneciente al paquete BeingOfTheEarth que pueda acceder a los metodos de SkyBeing*/
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
