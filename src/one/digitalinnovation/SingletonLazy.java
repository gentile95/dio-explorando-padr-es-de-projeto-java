package one.digitalinnovation;

//    Singleton "preguiçoso"
//    @author Lucas Gentile

public class SingletonLazy {

    private static SingletonLazy instancia;
    private SignletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;

    }

}
