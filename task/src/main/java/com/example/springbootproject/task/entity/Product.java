package com.example.springbootproject.task.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_id_sequence",
            sequenceName = "product_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_id_sequence"
    )

    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer quantityInStock;

    @ManyToOne
    @JoinColumn(name = "Category_product_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "Supplier_product_id")
    private Supplier supplier;
}
