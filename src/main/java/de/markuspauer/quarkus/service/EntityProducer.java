package de.markuspauer.quarkus.service;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import de.markuspauer.quarkus.attribute.FirstName;
import de.markuspauer.quarkus.attribute.LastName;
import de.markuspauer.quarkus.entity.Customer;

@ApplicationScoped
public class EntityProducer implements Serializable {

    private static final long serialVersionUID = 8771364888294100315L;

    @Produces
    Customer createCustomer() {
        var customer = new Customer();
        customer.setFirstName(new FirstName());
        customer.setLastName(new LastName());
        return customer;
    }
    
}
