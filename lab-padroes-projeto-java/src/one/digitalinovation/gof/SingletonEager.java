package one.digitalinovation.gof;

/**
 * Singleton "apressado"
 * 
 * @author YuriQuest
 */
public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager () {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}