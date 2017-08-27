package io.users.repository;

import org.springframework.data.repository.CrudRepository;

import io.users.domain.User;

public interface UserRepository extends CrudRepository<User, String> {

	User findByEmail(String email);

}
