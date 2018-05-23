package com.target.myRetail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.target.myRetail.ProductItem.Price;
import com.target.myRetail.ProductItem.ProductItem;
import com.target.myRetail.ProductItem.ProductItemRepository;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.mongo.tests.MongodForTestsFactory;
import de.flapdoodle.embed.process.runtime.Network;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyRetailApplicationTests {

	
	    @Autowired
	    private ProductItemRepository repoImpl;

	    private static MongodProcess mongoProcess;
	   
	    private static MongodExecutable mongoExecutable;
	    private static MongodForTestsFactory factory;
	    
	    @BeforeClass
	    public static void setUp() throws Exception {
	    	initializeDB();
	    	
	    	factory = MongodForTestsFactory.with(Version.Main.DEVELOPMENT);

	    	factory.newMongo();
	    	
			
	    }

	    
	     private static void initializeDB() throws IOException {

	        MongodStarter starter = MongodStarter.getDefaultInstance();

	       mongoExecutable = starter.prepare(new MongodConfigBuilder()
					.version(Version.Main.DEVELOPMENT)
					.net(new Net("localhost", 27028, Network.localhostIsIPv6()))
					.build());
	        mongoProcess = mongoExecutable.start();
	        
	        
	    }

	    
	    private  void initializeCollection() throws IOException {

	    	ProductItem productItem = new ProductItem("1", "Jungle Book", new Price("13.49","USD"));
	        repoImpl.save(productItem);

	        
	    }
	    
	    @AfterClass
	    public static void tearDown() throws Exception {
	    	mongoExecutable.stop();
	        mongoProcess.stop();
	        
	    }


	    @Test
	    public void testGetProductItemById() throws IOException {
	    	
	    	initializeCollection();
	    	assertNotNull(repoImpl.findById("1"));
	    }
	    
	    @Test
	    public void testUpdateProductItem() {
	    	
	    	ProductItem productItem = new ProductItem("1", "Jungle Book", new Price("15.49","USD"));
	        repoImpl.save(productItem);
	        assertEquals(repoImpl.findById("1").get().getPrice().getValue(),"15.49");
	        
	       
	    }

}



