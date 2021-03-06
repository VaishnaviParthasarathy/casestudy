package com.target.myRetail.ProductItem;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.target.ProductDetails.ProductDetails;



@RestController
@RequestMapping(value="/productDetails")
public class ProductDetailController {
	
	public static final Logger logger = LoggerFactory.getLogger(ProductDetailController.class);

	@Value("${externalapi.path}")
	private String externalAPIPath;
	
	@GetMapping(value="/{id}")
	public String getProductNameById(@PathVariable("id") String id) {
		
		
		 RestTemplate restTemplate = new RestTemplate();
		
		 try{
		 
		 ResponseEntity<ProductDetails> getResponse=restTemplate.getForEntity(externalAPIPath,ProductDetails.class,id);
		 
		 if(getResponse.getStatusCode().is2xxSuccessful()){
				
			 ProductDetails productDetail=getResponse.getBody();
			 return productDetail.getProduct().getItem().getProductDescription().getTitle();
		 }
		 
		 }catch (HttpClientErrorException | HttpServerErrorException httpClientOrServerExc) {

			    if(HttpStatus.NOT_FOUND.equals(httpClientOrServerExc.getStatusCode())) {
			    	logger.info("Product id not found");
			    	return null;
			    }
			    else{
			    	return null;
			    }
			}
		return null;
		
		 
		
	        
	}

}
