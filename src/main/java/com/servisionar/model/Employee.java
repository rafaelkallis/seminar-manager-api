package com.servisionar.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by rafaelkallis on 27.08.16.
 */
@Entity
@EqualsAndHashCode(callSuper = true, exclude = {"seminars", "company"})
public class Employee extends Person {

    @ManyToMany(mappedBy = "employees")
    @Column(nullable = false, insertable = false, updatable = false)
    @Getter
    private Set<Seminar> seminars;

    @ManyToOne
    @JoinColumn
    @Getter
    @Setter
    private Company company;
}
