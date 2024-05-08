package ag.selm.manager.repository;

import org.springframework.stereotype.Repository;
import ag.selm.manager.entiti.Product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private final List<Product> products = Collections.synchronizedList(new LinkedList<>());

    public InMemoryProductRepository() {
        IntStream.range(1,4)
                .forEach(i -> this.products.add(new Product(i, "Товар №" + i,
                        "Описание товара№" + i)));
    }

    @Override
    public List<Product> findAll() {
        return Collections.unmodifiableList(this.products);
    }
}
