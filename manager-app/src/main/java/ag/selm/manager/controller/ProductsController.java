package ag.selm.manager.controller;

import ag.selm.manager.servises.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
@RequestMapping("catalog/products")
public class ProductsController {
    private  ProductService productService;


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String getProductList(Model model) {
        model.addAttribute("products", this.productService.findAllProducts());
        return "cataloge/products/list";
    }
}
