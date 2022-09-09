package edu.miu.springdataday3.service;

import edu.miu.springdataday3.entity.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    //get
    List<ProductDTO> getAll();

    //post
    ProductDTO create(ProductDTO productDTO);

    //update
    ProductDTO update(Long Id, ProductDTO productDTO);

    //delete
    ProductDTO delete(Long Id);


    List<ProductDTO> minPrice(Long price);
}