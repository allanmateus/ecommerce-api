package com.example.ecommerce.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idProduct")
@Table(name = "tb_products")

public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    @Column(name = "id")
    private UUID idProduct;
    @Column(name = "nome")
    private String name;
    @Column(name = "marca")
    private String brand;
    @Column(name = "cor")
    private String color;
    @Column(name = "categoria")
    private String category;
    @Column(name = "valor")
    private BigDecimal value;
}
