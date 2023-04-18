package com.msa.assignment.productservice.dao;

import com.msa.assignment.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductServiceRepository extends JpaRepository<Product, String> {
}
