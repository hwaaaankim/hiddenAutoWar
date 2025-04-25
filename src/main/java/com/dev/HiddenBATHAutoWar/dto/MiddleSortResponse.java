package com.dev.HiddenBATHAutoWar.dto;

import java.util.List;

import lombok.Data;

@Data
public class MiddleSortResponse {
    private Long middleSortId;
    private String middleSortName;
    private List<ProductResponse> products;
}