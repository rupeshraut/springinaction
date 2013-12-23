package com.dev.web.dal.dao;

import java.util.Collection;

import org.springframework.stereotype.Repository;

/**
 * The Class TestDAOImpl.
 */
@Repository("testDAO")
public class TestDAOImpl implements TestDAO {

    /**
     * List.
     *
     * @return the collection
     * @see com.dev.web.dal.dao.TestDAO#list()
     */
    @Override
    public Collection<String> list() {
        return System.getProperties().stringPropertyNames();
    }

}
