package com.idotrick.gssb.user.service;

import java.util.List;

import com.idotrick.gssb.common.dao.Dao;
import com.idotrick.gssb.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private Dao dao;

	public List<User> listUsers() {
		return dao.list();
	}

	public User getById(int id) {
		return (User) dao.getById(id);
	}

	public List<User> getUserByString(String searchTerm) {
		return dao.getByString(searchTerm);
	}

	public void saveUser(User user) {
		dao.save(user);
	}	

	public void updateUser(User user) {
		dao.update(user);
	}

	public void removeUser(int id) {
		dao.remove(id);
	}

	public Dao getUserDao() {
		return dao;
	}

	@Override
	public User getUserById(int id) {
		return null;
	}
}
