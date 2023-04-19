package com.msa.assignment.productservice.controller;

import com.msa.assignment.productservice.dao.ProductServiceRepository;
import com.msa.assignment.productservice.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductServiceController {


    private final ProductServiceRepository prodRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return prodRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product){
        prodRepo.save(product);
    }
}
