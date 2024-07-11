package creational.singleton;

/*

If your singleton class is not using a lot of resources, this is the approach to use

 */

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance  = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
