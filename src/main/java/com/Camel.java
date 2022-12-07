package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Camel {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
