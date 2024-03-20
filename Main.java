import BeingsOfTheEarth.Human;
import BeingsOfTheEarth.Werewolf;
import Creator.LivingBeingCreator;
import Creator.TypeOfBeing;
import LivingBeing.LivingBeing;
import SkyBeings.Angel;
import SkyBeings.Bird;
import SkyBeings.Gargoyle;

public class Main {
    public static void main(String[] args) {

        /* Se instancian los objetos dentro de un try-catch ya que se esta utilizando manejo de excepciones
        en el metodo createLivingBeing() de la interfaz Creator y la clase LivingBeingCreator */
        try{
            System.out.println("Maestro TIC:");
            LivingBeing humano = LivingBeingCreator.createLivingBeing(TypeOfBeing.HUMAN); // Creamos objeto tipo Humano a travez del metodo Factory
            humano.born();
            humano.grow();
            humano.reproduce();
            ((Human)humano).fly(); // Se castea el objeto Humano para acceder a los metodos de las interfaces que esta implementando la clase Humano (SkyBeing y EarthBeing)
            ((Human)humano).land();
            ((Human)humano).respawn();
            humano.die();

            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println();

            System.out.println("Objeto Gaviota:");
            LivingBeing gaviota = LivingBeingCreator.createLivingBeing(TypeOfBeing.BIRD);
            gaviota.born();
            gaviota.grow();
            gaviota.reproduce();
            ((Bird)gaviota).fly();
            ((Bird)gaviota).land();
            gaviota.die();

            System.out.println();
            System.out.println("-------------------------------------------------------");
            System.out.println();

            System.out.println("Objeto Hombre Lobo:");
            LivingBeing werewolf = LivingBeingCreator.createLivingBeing(TypeOfBeing.WEREWOLF);
            werewolf.born();
            werewolf.grow();
            werewolf.reproduce();
            ((Werewolf) werewolf).respawn();
            ((Werewolf) werewolf).bite();
            werewolf.die();

            System.out.println();
            System.out.println("-------------------------------------------------------");
            System.out.println();

            System.out.println("Objeto Angel:");
            LivingBeing angelito = LivingBeingCreator.createLivingBeing(TypeOfBeing.ANGEL);
            angelito.born();
            angelito.grow();
            ((Angel) angelito).fly();
            ((Angel) angelito).changeDimension();
            ((Angel) angelito).land();
            angelito.die();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
