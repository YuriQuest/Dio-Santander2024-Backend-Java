package one.digitalinovation.gof.Singleton;

/**
 * Singleton "preguiçoso"
 * 
 * @author YuriQuest
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy () {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}