package singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FIRST SINGLETON");
        Singleton anotherSingleton = Singleton.getInstance("SECOND SINGLETON");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());
    }
}
