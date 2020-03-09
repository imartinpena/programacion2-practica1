package org.pr2;

/**
 * Hello world!
 *
 */
public class MiArrayList<E> {
    private int tamMax = 10;
    private Object[] elementData = new Object[tamMax];
    private int tam = 0;
    public boolean remove(E e){
        if (elementData[0].equals(e)) tam--;
        return false;
    }

    public int size(){
        return tam;
    }

    public void add(E e){
        elementData[tam++] = e;
    }

    public boolean isEmpty(){
        return tam==0;
    }

}
