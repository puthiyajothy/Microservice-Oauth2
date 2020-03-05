package com.java.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.java.oauth.model.User;

public interface UserDetailsRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String name);
}
