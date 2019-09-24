package com.example.demo;

import java.util.Optional;


public interface LoginRepository {
	Optional<Login> findOneById(String id);
}
