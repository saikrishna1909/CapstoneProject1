package com.example.CapstoneProject1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CapstoneProject1.Entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	public User findByUsername(String username);
}
