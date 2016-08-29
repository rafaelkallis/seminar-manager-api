package com.servisionar.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by rafaelkallis on 06/08/16.
 */
@Entity
@EqualsAndHashCode(of = "id")
public class Seminar {

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

    @Column
    @Getter
    @Setter
    private Date date;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn
    @Getter
    @Setter
    private Set<Employee> employees;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    @Getter
    @Setter
    private Officer officer;
}
