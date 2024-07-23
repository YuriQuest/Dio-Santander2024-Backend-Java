package one.digitalinovation.gof;

import one.digitalinovation.gof.Singleton.SingletonEager;
import one.digitalinovation.gof.Singleton.SingletonLazy;
import one.digitalinovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinovation.gof.Stategy.Comportamento;
import one.digitalinovation.gof.Stategy.ComportamentoAgresivo;
import one.digitalinovation.gof.Stategy.ComportamentoAgressivo;
import one.digitalinovation.gof.Stategy.ComportamentoDefensivo;
import one.digitalinovation.gof.Stategy.ComportamentoNormal;
import one.digitalinovation.gof.Stategy.Robo;

public class Test {

    
    public static void main(String[] args){

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento normal    = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo  = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
    }
    
}
