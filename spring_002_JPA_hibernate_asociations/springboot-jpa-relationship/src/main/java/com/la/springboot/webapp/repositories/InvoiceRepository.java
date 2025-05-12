package com.la.springboot.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.la.springboot.webapp.entities.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>{
    
}
