package ag.selm.manager.repository;

import ag.selm.manager.entiti.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
