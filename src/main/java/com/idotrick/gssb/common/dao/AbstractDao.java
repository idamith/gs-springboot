package com.idotrick.gssb.common.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;

public abstract class AbstractDao implements Dao {
	@PersistenceContext	
	private EntityManager entityManager;
    
	protected abstract Criteria getCriteria();
		
    protected Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
	@Override
	public List list() {
		return getCriteria().list();
	}    
    
	@Override
	public void save(Object o) {
		getSession().save(o);
		
	}

	@Override
	public void remove(Object o) {
		getSession().delete(o);		
	}

	@Override
	public void update(Object o) {
		getSession().update(o);			
	}    
}
