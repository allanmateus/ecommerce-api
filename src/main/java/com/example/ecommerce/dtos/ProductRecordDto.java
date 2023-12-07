package com.example.ecommerce.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRecordDto(@NotBlank String description, @NotBlank String brand, @NotBlank String category, @NotBlank String color,  @NotNull BigDecimal price) {
}
