package com.example.springcorehw;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductService {

    List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void printAll() {
        System.out.println(productList);
    }

    public Product findByTitle(String title) {
        return productList.stream().filter(product -> product.title.equals(title)).collect(Collectors.toList()).get(0);
    }

    @PostConstruct
    public void prepare() {
        productList.add(new Product(1, "Product1", 10L));
        productList.add(new Product(2, "Product2", 20L));
        productList.add(new Product(3, "Product3", 30L));
        productList.add(new Product(4, "Product4", 40L));
        productList.add(new Product(5, "Product5", 50L));
        productList.add(new Product(6, "Product6", 60L));
        productList.add(new Product(7, "Product7", 70L));
        productList.add(new Product(8, "Product8", 80L));
        productList.add(new Product(9, "Product9", 90L));
        productList.add(new Product(10, "Product10", 100L));
    }

}
