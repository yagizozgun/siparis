package com.siparisProject.siparis.business;

import com.siparisProject.siparis.dataAccess.ProductRepository;
import com.siparisProject.siparis.model.dto.request.CreateProductRequest;
import com.siparisProject.siparis.model.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductManager {

    private final ProductRepository productRepository;

    public void createProduct(CreateProductRequest productRequest)
    {
        Product product = new Product();
        product.setProductCode(productRequest.getProductCode());
        product.setName(productRequest.getName());
        product.setSize(productRequest.getSize());
        productRepository.save(product);
    }

}
