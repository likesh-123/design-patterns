package creational.singleton;

/*

If your singleton class is not using a lot of resources, this is the approach to use

 */

public class eagerInitializedSingleton {
    private static final eagerInitializedSingleton instance  = new eagerInitializedSingleton();

    private eagerInitializedSingleton(){}

    public static eagerInitializedSingleton getInstance(){
        return instance;
    }
}
