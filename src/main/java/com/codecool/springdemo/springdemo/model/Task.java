package com.codecool.springdemo.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter
@AllArgsConstructor
public class Task {
    private Long id;
    private String title;
}
