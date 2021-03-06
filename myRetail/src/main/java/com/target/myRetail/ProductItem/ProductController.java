package com.target.myRetail.ProductItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value="/myRetail")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Value("${productDetail.path}")
	private String productDetailPath;
	
	/**
	 * updates an existing ProductItem 
	 * @param productItem
	 * @return 
	 */
	
	@PostMapping(value="/products/{id}")
	public ResponseEntity<?> updateProductItem(@PathVariable("id") String id,@RequestBody ProductItem productItem){
		productItem.setProductId(id);
		return ResponseEntity.ok().body(productService.updateProduct(productItem));
	}
	
	/**
	 * retrieves the product name and price based on id
	 * and returns a ProductItem
	 * @param id
	 * @return
	 */
	@GetMapping(value="/products/{id}")
	public ResponseEntity<?> getProductItemById(@PathVariable("id") String id){
		
		// performs a GET request to external API
		String productName=getProductNameById(id);
		
		if(productName==null){
			return ResponseEntity.notFound().build();
		}
		
		ProductItem productItem=new ProductItem(id, 
				productName,
				productService.getProductItemById(id).getPrice());
		
		return ResponseEntity.ok().body(productItem);
		
	}

	
	/**retrieves the product name
	 * makes a GET request to external API
	 * @param id
	 */
	private String getProductNameById(String id) {
		
		
		 RestTemplate restTemplate = new RestTemplate();
		
		 String productName = restTemplate.getForObject(productDetailPath, 
				String.class,id);
		 
		 return productName;
	        
	}

}
