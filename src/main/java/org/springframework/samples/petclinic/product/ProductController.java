package org.springframework.samples.petclinic.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String showProductList(Model model) {

        List<Product> prods = new ArrayList<Product>();
        model.addAttribute("products", prods);
        prods.add(new Product("p1", "Produto 1"));
        prods.add(new Product("p2", "Produto 2"));

        return "products/productsList";
    }
}
