package com.servisionar.repository;

import com.servisionar.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by rafaelkallis on 06/08/16.
 */
@RepositoryRestResource(path = "/companies")
public interface CompanyRepository extends JpaRepository<Company, String>, BaseRepository<Company> {
}
