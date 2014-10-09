package br.com.amsterdatech.lib.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import br.com.amsterdatech.lib.enviroment.Bucket;

/**
 * Created by williamgouvea on 10/9/14.
 */
public class ChronosBlockingQueue implements BlockingQueue<Bucket>{
    @Override
    public boolean add(Bucket bucket) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Bucket> buckets) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(Bucket bucket) {
        return false;
    }

    @Override
    public Bucket remove() {
        return null;
    }

    @Override
    public Bucket poll() {
        return null;
    }

    @Override
    public Bucket element() {
        return null;
    }

    @Override
    public Bucket peek() {
        return null;
    }

    @Override
    public void put(Bucket bucket) throws InterruptedException {

    }

    @Override
    public boolean offer(Bucket bucket, long l, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    @Override
    public Bucket take() throws InterruptedException {
        return null;
    }

    @Override
    public Bucket poll(long l, TimeUnit timeUnit) throws InterruptedException {
        return null;
    }

    @Override
    public int remainingCapacity() {
        return 0;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> objects) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> objects) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> objects) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<Bucket> iterator() {
        return null;
    }

    @Override
    public int drainTo(Collection<? super Bucket> objects) {
        return 0;
    }

    @Override
    public int drainTo(Collection<? super Bucket> objects, int i) {
        return 0;
    }
}
