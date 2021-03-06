package com.target.myRetail.ProductItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductItemRepository productRepository;

	public ProductItem updateProduct(ProductItem productItem) {
		
		return productRepository.save(productItem);
	}

	public ProductItem getProductItemById(String id) {
		
		return productRepository.findById(id).get();
		
	}

	

}
