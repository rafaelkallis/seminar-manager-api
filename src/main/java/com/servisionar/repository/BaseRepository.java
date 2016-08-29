package com.servisionar.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * Created by rafaelkallis on 27.08.16.
 */
@NoRepositoryBean
public interface BaseRepository<T> extends Repository<T, String> {

    Optional<T> findById(String id);
}
