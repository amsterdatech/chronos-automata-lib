package br.com.amsterdatech.lib.templates;

import java.util.concurrent.BlockingQueue;

import br.com.amsterdatech.lib.strategies.IConsumerStrategy;

/**
 * Created by williamgouvea on 10/9/14.
 */
public abstract class ConsumerTemplate<E> implements IConsumerStrategy<E> {
    private final BlockingQueue<E> queue;

    public ConsumerTemplate(BlockingQueue<E> q) {
        queue = q;
    }


    @Override
    public void headline() {

    }

    public void solve() {
        while (queue.size() > 0) {
            System.out.println("[ Size " + queue.size() + " ]");
            System.out.println(queue.peek().toString());

            consume(queue.poll());
        }

    }

    @Override
    public void run() {
        solve();
    }
}
