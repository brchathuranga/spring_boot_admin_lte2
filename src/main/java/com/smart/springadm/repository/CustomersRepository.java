package com.smart.springadm.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.springadm.model.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
