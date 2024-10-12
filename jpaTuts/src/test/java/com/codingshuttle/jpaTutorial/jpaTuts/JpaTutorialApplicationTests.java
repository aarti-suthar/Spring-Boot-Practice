package com.codingshuttle.jpaTutorial.jpaTuts;
import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.codingshuttle.jpaTutorial.jpaTuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class JpaTutorialApplicationTests {

//	@Autowired
//	private ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	void testRepository(){
//		ProductEntity productEntity = ProductEntity
//				.builder()
//				.sku("nestle123")
//				.title("Nestle Chcocolate")
//				.price(BigDecimal.valueOf(123.45))
//				.quantity(3)
//				.build();
//		ProductEntity savedProductEntity = productRepository.save(productEntity);
//		System.out.println(savedProductEntity);
//	}

//	@Test
//	void getRepository(){
//		List<ProductEntity> products = productRepository.findAll();
//		System.out.println(products);
//	}

//	@Test
//	void getRepository(){
//		List<ProductEntity> product = productRepository.findByTitle("Nestle Chocolate");
//		System.out.println(product);
//	}

//	@Test
//	void getRepository(){
//		List<ProductEntity> entities = productRepository
//				.findCreatedAtAfter(LocalDateTime.of(2024,1,1,0,0,0));
//		System.out.println(entities);
//	}

}
