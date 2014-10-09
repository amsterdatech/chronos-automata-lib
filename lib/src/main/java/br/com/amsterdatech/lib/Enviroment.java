package br.com.amsterdatech.lib;

import br.com.amsterdatech.lib.interactors.BasicLogger;
import br.com.amsterdatech.lib.interactors.BasicSearchLogger;
import br.com.amsterdatech.lib.templates.Strategy;

/**
 * Created by williamgouvea on 10/9/14.
 */
public class Enviroment {
    public static void clientCode(Strategy strat){
        strat.solve();
    }

    public static void main(String[] args){
        Strategy[] algorithms = {new BasicLogger(), new BasicSearchLogger()};

        for (int i=0; i < algorithms.length; i++) {
            clientCode( algorithms[i] );
        }
    }
}
