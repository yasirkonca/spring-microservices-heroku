package com.ykonca.Test.repository;


import com.ykonca.Test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 11.04.2021
 * @time 18:16
 */
public interface IProductRepository extends JpaRepository<Product, Long>
{
}
