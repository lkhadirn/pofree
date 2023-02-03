package com.pofree.pofree.persitence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pofree.pofree.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
}
