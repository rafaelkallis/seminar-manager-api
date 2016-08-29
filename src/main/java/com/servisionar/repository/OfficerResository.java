package com.servisionar.repository;

import com.servisionar.model.Officer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by rafaelkallis on 29.08.16.
 */
@RepositoryRestResource(path = "officers")
public interface OfficerResository extends JpaRepository<Officer, String>, BaseRepository<Officer> {
}
