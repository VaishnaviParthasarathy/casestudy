# casestudy
Case study for myRetail

Frameworks/DB used  
-Spring Boot  
-Spring Data Rest  
-mongoDb  
-Embedded mongoDb for JUnit Test class  
-RestTemplate  

myRetail is a Spring Boot Application which responds to GET request to retrieve product details based on id.

GET URL : http://localhost:8084/myRetail/products/{id}  
- Performs a GET request to API hosted internally which inturn fires a GET request to redsky.target.com to 
retrieve the Product title .  
- Performs a Database read operation to retrieve price details from local mongoDb instance.  
- Returns a JSON response with product name and price details.  

POST URL : http://localhost:8084/myRetail/products/{id}  
- Performs a Database save/update operation in order to update the details given in JSON request.

MyRetailApplication - Spring Boot Application class  
ProductController   - Main Controller class which responds to GET  
ProductDetailController - Controller class which performs GET to external API  
ProductItem  - Entity/Collection class being mapped  
MyRetailApplicationTests  
- JUnit class which runs JUnit test using Embedded MongoDb (de.flapdoodle.embed.mongo)



