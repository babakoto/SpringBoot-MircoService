package fr.youngdev.ecommerce.controller;

import fr.youngdev.ecommerce.dao.ProductDao;
import fr.youngdev.ecommerce.exception.Product404Exception;
import fr.youngdev.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    public ProductDao productDao;

    // add product
    @PostMapping(value = "/product/add")
    public Product addProduct(@RequestBody Product product){
        return productDao.save(product);
    }

    // list all
    @GetMapping(value = "/product/all")
    public List<Product> listAllProduct(){
        return productDao.findAll();
    }

    // get by ID
    @GetMapping(value = "product/{id}")
    public Product findById(@PathVariable int id)throws Product404Exception{
        Product product = productDao.findById(id);
        if (product==null) throw new Product404Exception("Product not found");
        return product;
    }

    @GetMapping(value = "/product/great/{prix}")
    List<Product> listProductGreatThan(@PathVariable int prix){
        return productDao.findByPrixGreaterThan(prix);
    }

    @GetMapping(value = "/product/less/{prix}")
    List<Product> listProductLessThan(@PathVariable int prix){
        return productDao.findByPrixLessThan(prix);
    }



}
