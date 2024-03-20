package SkyBeings;

public interface SkyBeing {
    public void fly();
    public void land();
    public default void changeDimension(){
        System.out.println("Changing to another dimension");
    };
}
