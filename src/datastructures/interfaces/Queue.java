package datastructures.interfaces;

import java.util.Collection;

public interface Queue<T> {
    boolean add(Object t);

    boolean offer(Object t);

    T remove();

    T poll();

    T element();

    T peek();

    boolean isEmpty();

    int size();
}
