package com.auth.oauth2jwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auth.oauth2jwt.document.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    
	Optional<User> findByUsername(String username);
    
	boolean existsByUsername(String username);
	
}
