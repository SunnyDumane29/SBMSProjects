package in.sunnyit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sunnyit.bindingEntity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
