package ag.selm.manager.entiti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer id;

    private String title;

    private String details;

    public Product(int i, String s, String s1) {
    }
}