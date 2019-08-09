package org.springframework.samples.petclinic.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    @GetMapping("/products")
    public String showProductList() {
        return "Hello";
    }
}
