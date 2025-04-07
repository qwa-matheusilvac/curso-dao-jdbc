package org.example.model.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Department {
    private Integer id;
    private String name;
    private List<Seller> sellers = new ArrayList<>();

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
