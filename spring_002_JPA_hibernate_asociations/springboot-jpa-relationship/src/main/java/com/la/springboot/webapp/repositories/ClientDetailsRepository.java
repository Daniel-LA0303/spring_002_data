package com.la.springboot.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.la.springboot.webapp.entities.ClientDetails;

public interface ClientDetailsRepository extends CrudRepository<ClientDetails, Long> {
    
}
