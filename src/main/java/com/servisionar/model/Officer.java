package com.servisionar.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by rafaelkallis on 27.08.16.
 */
@Entity
@EqualsAndHashCode(callSuper = true, exclude = "seminars")
public class Officer extends Person {

    @OneToMany(mappedBy = "officer")
    @Column(nullable = false, insertable = false, updatable = false)
    @Getter
    private Set<Seminar> seminars;
}
