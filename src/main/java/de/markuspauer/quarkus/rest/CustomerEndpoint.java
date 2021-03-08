package de.markuspauer.quarkus.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.markuspauer.quarkus.entity.Customer;
import de.markuspauer.quarkus.repository.CustomerRepository;

@Path("/customer")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
public class CustomerEndpoint {
    
    @Inject
    CustomerRepository customerRepository;
    
    @GET
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
