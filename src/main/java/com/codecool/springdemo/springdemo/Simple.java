package com.codecool.springdemo.springdemo;

import lombok.*;


//@Data = @Getter/@Setter/@ToString/@EqualsAndHashcode/@requireAgrConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Simple {
    private Long id;
    private String name;
}
