package com.unla.example.models.dtos.responses;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExampleResponseDTO {

    private Integer id;

    private String name;

    private BigDecimal price;

    private boolean softDeleted;
}
