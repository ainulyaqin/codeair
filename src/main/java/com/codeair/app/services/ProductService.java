package com.codeair.app.services;

import com.codeair.app.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
    
    void deleteProduct(Integer id);
}
