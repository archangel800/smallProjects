package com.datajpa.relationship.dto.resposeDto;

import lombok.Data;

import java.util.List;

@Data
public class AuthorResponseDto {
    private Long id;
    private String name;
    private List<String> bookNames;
    private String zipcodeName;
}
