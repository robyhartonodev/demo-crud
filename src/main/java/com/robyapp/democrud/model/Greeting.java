package com.robyapp.democrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter
public class Greeting implements Serializable {
    private @Id Long id;
    private String content;

    public Greeting() {

    }

    public Greeting(long id, String content) {

        this.id = id;
        this.content = content;
    }
}
