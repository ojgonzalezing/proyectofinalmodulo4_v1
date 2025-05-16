package com.codegym.dao;

import com.codegym.domain.Country;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CountryDAO {

    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public List<Country> getAll(){
        Query<Country> query = sessionFactory.getCurrentSession().createQuery("SELECT c FROM Country c", Country.class);
        return query.getResultList();
    }
}
