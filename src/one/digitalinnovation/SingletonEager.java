package one.digitalinnovation;

//    Singleton "apressado"
//    @author Lucas Gentile


public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;

    }
}
