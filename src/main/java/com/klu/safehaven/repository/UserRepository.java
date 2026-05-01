package com.klu.safehaven.repository;

import com.klu.safehaven.entity.User;
import com.klu.safehaven.repository.*;
	import org.springframework.data.jpa.repository.JpaRepository;

	public interface UserRepository extends JpaRepository<User, Long> {

	}

