package br.com.amsterdatech.lib.templates;

/**
 * Created by williamgouvea on 10/9/14.
 *
 * Abstract Class which uses TemplateMethod pattern and also define a simple strategy type
 * I realize that it`s has a link with Iterator and Streams (NIO)
 *
 * Study List
 *
 * NIO
 * RxJava
 * Otto
 * Tape
 * EventBus
 */
public abstract class BasicTemplate implements Strategy {

    public void solve() {
        headline();
        start();

        while (nextTry() && !isSolution()) {
            step();
        }
        stop();

    }

    protected abstract void start();

    protected abstract boolean nextTry();

    protected abstract boolean isSolution();

    protected abstract void stop();

    protected abstract void step();
}
