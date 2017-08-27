package io.users.service;

import java.util.List;

import io.users.domain.User;

public interface UserService {

	List<User> findAll();

	User findOne(String id);

	User addOne(User user);

}
