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
public class LastName {
    @NonNull
    @NotEmpty(message = "Der Nachname darf nicht leer sein")
    @Size(min = 2, max = 100, message = "Der Nachname muss mindestens {min} und maximal {max} Zeichen lang sein")
    @Column(name = "lastname")
    private String value;
}
