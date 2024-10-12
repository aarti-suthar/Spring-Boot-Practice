package com.codingshuttle.jpaTutorial.jpaTuts.repositories;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {


    //List<ProductEntity> findByTitle(String title);

    //List<ProductEntity> findCreatedAtAfter(LocalDateTime of);

    //List<ProductEntity> findByTitleOrderByPrice(String title);

    List<ProductEntity> findByOrderByPrice();
}
