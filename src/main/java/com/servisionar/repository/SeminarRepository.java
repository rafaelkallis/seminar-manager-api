package com.servisionar.repository;

import com.servisionar.model.Seminar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by rafaelkallis on 06/08/16.
 */
@RepositoryRestResource(path = "/seminars")
public interface SeminarRepository extends JpaRepository<Seminar, String> {
}
