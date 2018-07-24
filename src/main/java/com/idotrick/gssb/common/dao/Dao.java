package com.idotrick.gssb.common.dao;

import java.util.List;

public interface Dao {	
	public void save(Object o);
	public void update(Object o);
	public List list();
	public Object getById(int id);
	public void remove(Object o);
	public List getByString(String searchTerm);
}
