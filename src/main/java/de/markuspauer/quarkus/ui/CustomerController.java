package de.markuspauer.quarkus.ui;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.logging.Logger;

import de.markuspauer.quarkus.entity.Customer;
import de.markuspauer.quarkus.service.CustomerService;

@Named
@RequestScoped
public class CustomerController {

    @Inject
    Logger log;

    @Inject
    private Customer customer;

    @Inject
    CustomerService customerService;

    @PostConstruct
    void init() {
        log.info("Initializing CustomerController");
    }

    public Customer getCustomer() {
        return customer;
    }

    public void save() {
        log.info("Customer: " + this.customer);
        customerService.save(customer);
    }
}
