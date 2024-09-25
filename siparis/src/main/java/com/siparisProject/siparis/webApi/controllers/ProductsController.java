package com.siparisProject.siparis.webApi.controllers;

import com.siparisProject.siparis.business.ProductManager;
import com.siparisProject.siparis.model.dto.request.CreateProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductManager productManager;

    @PostMapping("/product")
    public void createProduct(@RequestBody CreateProductRequest productRequest)
    {
        productManager.createProduct(productRequest);
    }
}
