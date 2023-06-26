package com.example.demo.domainObject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class peopleEntity {
    private int id;
    private String name;
    private int age;
    private String sex;
}
