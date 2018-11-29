package fr.youngdev.ecommerce.dao;

import fr.youngdev.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

     Product findById(int id);
     List<Product> findByPrixGreaterThan(int prix);
     List<Product> findByPrixLessThan(int prix);
}
