package com.servisionar.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by rafaelkallis on 06/08/16.
 */
@Entity
@Inheritance
@EqualsAndHashCode(of = "id")
public abstract class Person {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Getter
    @Setter
    private String id;

    @Column(nullable = false)
    @Getter
    @Setter
    private String name;
}
