package com.servisionar.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by rafaelkallis on 06/08/16.
 */
@Entity
@EqualsAndHashCode(of = "id")
public class Company {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Getter
    @Setter
    private String id;

    @Column(unique = true, nullable = false)
    @Getter
    @Setter
    private String name;

    @OneToMany(mappedBy = "company")
    @Column(nullable = false, insertable = false, updatable = false)
    @Getter
    @Setter
    private Set<Employee> employees;
}
