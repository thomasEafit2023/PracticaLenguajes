package SkyBeings;

public interface SkyBeing {
    void fly();
    void land();

    /* Declaramos el metodo changingDimension() como opcional ya que no es un metodo necesario obligatorio
     para los seres del cielo en general excepto por las criaturas como Angel y Gargoyle */
    default void changeDimension(){
        System.out.println("Changing to another dimension");
    };
}
