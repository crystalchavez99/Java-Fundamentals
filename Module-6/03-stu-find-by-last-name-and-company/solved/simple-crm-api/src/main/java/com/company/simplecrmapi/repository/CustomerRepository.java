package com.company.simplecrmapi.repository;

import com.company.simplecrmapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByLastName(String lastName);

    List<Customer> findByCompany(String company);

    List<Customer> findByLastNameAndCompany(String lastName, String company);
}
