package br.com.amsterdatech.lib.strategies;

/**
 * Created by williamgouvea on 10/9/14.
 */
public interface IConsumerStrategy<E> extends Strategy{
    public void consume(E e);
}
