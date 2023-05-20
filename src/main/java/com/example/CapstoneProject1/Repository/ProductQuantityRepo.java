package com.example.CapstoneProject1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CapstoneProject1.Entity.ProductQuantity;


@Repository
public interface ProductQuantityRepo extends JpaRepository<ProductQuantity, Long>{

}
