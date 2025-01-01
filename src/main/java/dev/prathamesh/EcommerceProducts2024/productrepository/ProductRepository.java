package dev.prathamesh.EcommerceProducts2024.productrepository;

import dev.prathamesh.EcommerceProducts2024.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
