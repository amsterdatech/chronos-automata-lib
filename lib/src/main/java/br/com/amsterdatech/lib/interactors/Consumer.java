package br.com.amsterdatech.lib.interactors;

import java.util.concurrent.BlockingQueue;

import br.com.amsterdatech.lib.enviroment.Bucket;
import br.com.amsterdatech.lib.templates.ConsumerTemplate;

/**
 * Created by williamgouvea on 10/9/14.
 */
public class Consumer extends ConsumerTemplate<Bucket> {
    private Thread consumerWorker;

    private static int consumerId = 0;


    public Consumer(BlockingQueue<Bucket> q) {
        super(q);
        consumerWorker = new Thread(this, "[ Consumer-" + consumerId++ +" ]");
        System.out.println(consumerWorker.getName());

    }

    @Override
    public void consume(Bucket bucket) {
        System.out.println("[ Consuming " + bucket.toString() +" ]");

    }
}
