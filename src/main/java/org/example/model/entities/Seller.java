package org.example.model.entities;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Seller {

    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double baseSalary;
    private Department department;

}
