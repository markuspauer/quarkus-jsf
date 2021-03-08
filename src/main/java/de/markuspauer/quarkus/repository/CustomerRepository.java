package de.markuspauer.quarkus.repository;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import de.markuspauer.quarkus.entity.Customer;

@ApplicationScoped
public class CustomerRepository implements Serializable {
    
    private static final long serialVersionUID = 678601594919413632L;
    
    @Inject
    EntityManager entityManager;

    public List<Customer> findAll() {
        return this.entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
    }

    public void save(Customer customer) {
        if (customer.getId() != null) {
            this.entityManager.persist(customer);
        } else {
            this.entityManager.merge(customer);
        }
    }

}
