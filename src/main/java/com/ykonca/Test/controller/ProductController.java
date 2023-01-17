package com.ykonca.Test.controller;


import com.ykonca.Test.model.Product;
import com.ykonca.Test.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/product") //pre-path
public class ProductController
{
    @Autowired
    private IProductService productService;

    @PostMapping // -> api/product
    public ResponseEntity<?> saveProduct(@RequestBody Product product)
    {
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}") //-> api/product/productId
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId)
    {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping // -> api/product
    public ResponseEntity<?> getAllProducts()
    {
        return ResponseEntity.ok(productService.findAllProducts());
    }
}
