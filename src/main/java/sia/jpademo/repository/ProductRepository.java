package sia.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sia.jpademo.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}