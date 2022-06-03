package com.jhkim2.udemywebfluxproductservice.repository;

import com.jhkim2.udemywebfluxproductservice.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
