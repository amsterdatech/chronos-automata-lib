package br.com.amsterdatech.lib.interactors;

import br.com.amsterdatech.lib.templates.BasicSearchTemplate;

/**
 * Created by williamgouvea on 10/9/14.
 */
public class BasicSearchLogger extends BasicSearchTemplate {
    private int state = 1;

    protected void preProcess() {
        System.out.println("[ preProcess  ]");
    }

    protected void postProcess() {
        System.out.println("[postProcess  ]");
    }

    @Override
    protected void step() {
        System.out.println("Step " + state++);
    }

    protected boolean search() {
        System.out.println("[search-" + state + " ]");
        return state == 10 ? true : false;
    }

    @Override
    public void headline() {

        String clazzName = getClass().getSimpleName();
        for(int i = 0;i<clazzName.length();i++){
            System.out.print("=");
            if(i == clazzName.length() -1){
                System.out.print("\n");

            }

        }

        System.out.println(" " +  clazzName + " ");
    }



}
