package de.markuspauer.quarkus.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import de.markuspauer.quarkus.entity.Customer;
import de.markuspauer.quarkus.repository.CustomerRepository;

@RequestScoped
public class CustomerService {
    
    @Inject
    CustomerRepository customerRepository;

    @Transactional
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

}
