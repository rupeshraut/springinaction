package com.dev.web.aop;

import java.util.Collection;

public interface DAO<E,V> {

    E save(V v);
    E update(V v);
    boolean delete(E e);
    Collection<E> list();
    E findById(Object id);
    
}
