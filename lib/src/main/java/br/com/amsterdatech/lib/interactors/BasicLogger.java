package br.com.amsterdatech.lib.interactors;

import br.com.amsterdatech.lib.templates.BasicTemplate;

/**
 * Created by williamgouvea on 10/9/14.
 */
public class BasicLogger extends BasicTemplate {
    public int state = 1;

    public BasicLogger(){

    }


    @Override
    public void headline() {
        String clazzName = getClass().getSimpleName();
        for(int i = 0;i<clazzName.length();i++){
            System.out.print("==");
            if(i == clazzName.length() -1){
                System.out.print("\n");

            }

        }

        System.out.println(clazzName + " ");
    }

    @Override
    protected void start() {
        System.out.println("Start");

    }

    @Override
    protected boolean nextTry() {
        System.out.println("Next Try - " + state + " ");
        return true;
    }

    @Override
    protected boolean isSolution() {
        boolean solution = (state == 10);
        System.out.println("IsSolution " + solution + " ");
        return solution;
    }

    @Override
    protected void stop() {
        System.out.println("Stop");
    }

    @Override
    protected void step() {
        System.out.println("Step " + state++);
    }

    @Override
    public void run() {
        solve();
    }
}
