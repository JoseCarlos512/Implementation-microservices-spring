package com.josecarlos.productmicroservice.repository;

import com.josecarlos.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {


}
