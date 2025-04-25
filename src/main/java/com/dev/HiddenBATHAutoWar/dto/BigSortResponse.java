package com.dev.HiddenBATHAutoWar.dto;

import java.util.List;

import lombok.Data;

@Data
public class BigSortResponse {
    private Long bigSortId;
    private String bigSortName;
    private List<MiddleSortResponse> middleSorts;
}
