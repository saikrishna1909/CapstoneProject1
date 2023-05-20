package com.example.CapstoneProject1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CapstoneProject1.Entity.Role;


@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{

}
