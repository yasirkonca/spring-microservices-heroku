package com.ykonca.Test.repository;


import com.ykonca.Test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductRepository extends JpaRepository<Product, Long>
{
}
