package org.springframework.samples.petclinic.product;

public class Product {

    private String description;
    private String name;

    public Product(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
