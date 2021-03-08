package de.markuspauer.quarkus.entity;

import javax.persistence.Entity;
import javax.validation.Valid;

import de.markuspauer.quarkus.attribute.FirstName;
import de.markuspauer.quarkus.attribute.LastName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Customer extends BaseEntity {
    @Valid
    private FirstName firstName;
    @Valid
    private LastName lastName;
}
