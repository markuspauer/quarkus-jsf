package de.markuspauer.quarkus.attribute;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Embeddable
@Data
@NoArgsConstructor
public class FirstName {
    @NonNull
    @NotEmpty(message = "Der Vorname darf nicht leer sein")
    @Size(min = 2, max = 100, message = "Der Vorname muss mindestens {min} und maximal {max} Zeichen lang sein")
    @Column(name = "firstname")
    private String value;
}
