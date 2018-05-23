package com.target.myRetail.ProductItem;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductItemRepository extends MongoRepository<ProductItem, String> {
	
}
