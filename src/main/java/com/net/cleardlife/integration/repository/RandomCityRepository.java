package com.net.cleardlife.integration.repository;

import org.springframework.data.repository.CrudRepository;

import com.net.cleardlife.integration.domain.RandomCity;

/**
 * Created by nydiarra on 10/05/17.
 */
public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
