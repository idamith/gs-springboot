package com.idotrick.gssb.user.service;

import java.util.List;

import com.idotrick.gssb.user.model.User;

public interface UserService {
	public void saveUser(User user);
	public void updateUser(User user);
	public List<User> listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
	public List<User> getUserByString(String searchTerm);
}
