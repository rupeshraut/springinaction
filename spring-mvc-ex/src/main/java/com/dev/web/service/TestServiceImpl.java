package com.dev.web.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.web.dal.dao.TestDAO;

/**
 * The Class TestServiceImpl.
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired private TestDAO testDAO;
    
    /**
     * List.
     * 
     * @return the collection
     * @see com.dev.web.service.TestService#list()
     */
    @Override
    public Collection<String> list() {
        return testDAO.list();
    }

}
