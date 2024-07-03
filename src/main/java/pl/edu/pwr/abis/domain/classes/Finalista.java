package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.enums.Kategoria;
import pl.edu.pwr.abis.domain.enums.StopienNagrody;

@Entity(name = "finalista")
@Getter
@Setter
public class Finalista {
    @Id
    private Long id;

    @NotNull
    @Enumerated
    private StopienNagrody nagroda;

    @NotNull
    @Enumerated
    private Kategoria kategoria;

    @OneToOne(optional = false)
    private Projekt projekt;
}
