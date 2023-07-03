package com.Kent.domain;

import lombok.Data;

/**
 * 書封裝類
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
