package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
