package br.com.amsterdatech.lib.interactors;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import br.com.amsterdatech.lib.enviroment.Bucket;
import br.com.amsterdatech.lib.templates.ConsumerTemplate;
import br.com.amsterdatech.lib.templates.ProducerTemplate;

/**
 * Created by williamgouvea on 10/9/14.
 */
public  class Producer extends ProducerTemplate<Bucket> {
    private Thread producerWorker;

    private static int producerId = 0;

    private AtomicInteger state;



    public Producer(BlockingQueue<Bucket> q) {
        super(q);

        producerWorker = new Thread(this, "[ Producer-" + producerId++ +" ]");
        state = new AtomicInteger();

        System.out.println(producerWorker.getName());
        System.out.println("[ Producing... ]");

    }

    @Override
    public Bucket produce() {
        state.getAndIncrement();

        System.out.println("[ Produce " + state.get() + " ]");
        return new Bucket().addParams(" Bucket " + state.get() , +  state.get());
    }

}