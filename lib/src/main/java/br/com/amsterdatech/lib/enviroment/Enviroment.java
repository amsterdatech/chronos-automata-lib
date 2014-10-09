package br.com.amsterdatech.lib.enviroment;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import br.com.amsterdatech.lib.interactors.BasicLogger;
import br.com.amsterdatech.lib.interactors.BasicSearchLogger;
import br.com.amsterdatech.lib.interactors.Consumer;
import br.com.amsterdatech.lib.interactors.Producer;
import br.com.amsterdatech.lib.strategies.Strategy;

/**
 * Created by williamgouvea on 10/9/14.
 */
public final class Enviroment {
    private final static BlockingQueue<Bucket> buckets;

    static {
        buckets = new LinkedBlockingDeque<Bucket>();
    }

    public static void clientCode(Strategy strat) {
        strat.solve();
    }

    public static void main(String[] args) {
        if (args[0].contains("--concurrent")) {

            clientCode(new Producer(buckets));
            clientCode(new Consumer(buckets));


        } else {
            Strategy[] algorithms = {new BasicLogger(), new BasicSearchLogger()};

            for (int i = 0; i < algorithms.length; i++) {
                clientCode(algorithms[i]);
            }
        }
    }
}
