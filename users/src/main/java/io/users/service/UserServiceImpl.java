package io.users.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.users.domain.User;
import io.users.exception.UserFound;
import io.users.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	public User findOne(String id) {
		return userRepository.findOne(id);
	}

	public User addOne(User user) {
		User existingUser = userRepository.findByEmail(user.getEmail());
		if (existingUser == null)
			return userRepository.save(user);
		else
			throw new UserFound("User already present with the email given");
	}

}
