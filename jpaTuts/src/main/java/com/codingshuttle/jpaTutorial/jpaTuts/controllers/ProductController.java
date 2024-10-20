package com.codingshuttle.jpaTutorial.jpaTuts.controllers;

import com.codingshuttle.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.codingshuttle.jpaTutorial.jpaTuts.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private final ProductRepository productRepository;
    private final int PAGE_SIZE = 5;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @GetMapping()
//    public List<ProductEntity> getAllProducts(){
//        return productRepository.findByTitleOrderByPrice("Mazza");
//    }

//    @GetMapping
//    public List<ProductEntity> getAllProducts(){
//        return productRepository.findByOrderByPrice();
//    }

    //using sort by to sort the data
    //By default items are sort in ascending order
//    @GetMapping
//    public List<ProductEntity> getAllProducts(@RequestParam(defaultValue = "id") String sortBy) {
//        return productRepository.findBy(Sort.by(sortBy));
//    }

    //Here is an example if you want to change the order
//    @GetMapping
//    public List<ProductEntity> getAllProducts(@RequestParam(defaultValue = "id") String sortBy){
//        return productRepository.findAll(Sort.by(Sort.Direction.DESC,sortBy));
//    }

     //Another way to sort to the items
//     @GetMapping
//     public List<ProductEntity> getAllProducts(@RequestParam(defaultValue = "id") String sortBy) {
//        return productRepository.findBy(Sort.by(
//                Sort.Order.desc(sortBy),
//                Sort.Order.asc("title")));
//     }

     //Pagination Example
     @GetMapping
     public List<ProductEntity> getAllProducts(@RequestParam(defaultValue= "id") String sortBy,
                                               @RequestParam(defaultValue = "0") Integer pageNumber){
        Pageable pageable = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(sortBy));
        return productRepository.findAll(pageable).getContent();
     }
}

