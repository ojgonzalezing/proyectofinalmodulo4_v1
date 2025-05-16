package com.codegym.dao;

import com.codegym.domain.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CityDAO {

    private final SessionFactory sessionFactory;

    public CityDAO(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public List<City> getItems(int offset, int limit){
        Query<City> query = sessionFactory.getCurrentSession().createQuery("SELECT c FROM City c", City.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.getResultList();
    }

    public int getTotalCount(){
        Query<Long> query = sessionFactory.getCurrentSession().createQuery("SELECT count(c) FROM City c", Long.class);
        return Math.toIntExact(query.getSingleResult());
    }
}
