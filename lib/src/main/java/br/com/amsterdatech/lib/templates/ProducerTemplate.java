package br.com.amsterdatech.lib.templates;

import java.util.concurrent.BlockingQueue;

import br.com.amsterdatech.lib.strategies.IConsumerStrategy;
import br.com.amsterdatech.lib.strategies.IProducerStrategy;

/**
 * Created by williamgouvea on 10/9/14.
 */
public abstract class ProducerTemplate<E> implements IProducerStrategy<E> {
    private final BlockingQueue<E> queue;

    private int count;

    public ProducerTemplate(BlockingQueue<E> q) {
        queue = q;
        count = 0;
    }


    @Override
    public void headline() {

    }

    public void solve() {
        try {
            while (count < 5) {
                queue.put(produce());
                count++;
            }
        } catch (InterruptedException ex) {
        }
    }


    @Override
    public void run() {
        solve();
    }

    @Override
    public abstract E produce();
}
