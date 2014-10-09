package br.com.amsterdatech.lib.templates;

/**
 * Created by williamgouvea on 10/9/14.
 */
public abstract class BasicSearchTemplate implements Strategy {

    @Override
    public void solve() {
        headline();
        while (true) {
            preProcess();
            if (search()) break;
            step();
            postProcess();
        }
    }
    protected abstract void preProcess();
    protected abstract boolean search();
    protected abstract void postProcess();
    protected abstract void step();


    @Override
    public void run() {

    }
}
