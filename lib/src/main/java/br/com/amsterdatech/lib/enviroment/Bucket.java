package br.com.amsterdatech.lib.enviroment;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by williamgouvea on 10/9/14.
 */
public class Bucket {
    private String key;
    private Object value;

    public Bucket() {
    }

    public Bucket addParams(String key, Object value) {
        this.key = key;
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new StringBuffer()
                        .append("[")
                        .append(key)
                        .append(" - ")
                        .append(value.toString())
                        .append("]").toString();
    }

}
