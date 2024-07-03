package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Data;
import pl.edu.pwr.abis.domain.enums.StatusPropozycji;

@Entity(name = "propozycja")
@Getter
@Setter
public class Propozycja {
    @Id
    private Long id;

    @NotNull
    @Enumerated
    private StatusPropozycji statusPropozycji;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
            "dataPrzeslania_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
            "dataPrzeslania_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
            "dataPrzeslania_rok"))
        }
    )
    private Data dataPrzeslania;

    @NotNull
    @Basic
    private boolean czyWiodacy;

    @ManyToOne(optional = false)
    private EkspertIPMA ekspertIPMA;

    @ManyToOne(optional = false)
    private Projekt projekt;
}
