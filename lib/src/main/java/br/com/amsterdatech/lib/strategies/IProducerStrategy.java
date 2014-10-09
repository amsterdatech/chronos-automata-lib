package br.com.amsterdatech.lib.strategies;

/**
 * Created by williamgouvea on 10/9/14.
 */
public interface IProducerStrategy<E> extends Strategy {
    public E produce();
}
