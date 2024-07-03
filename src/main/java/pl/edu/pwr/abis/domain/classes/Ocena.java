package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Data;
import pl.edu.pwr.abis.domain.enums.KryteriumPEM;
import pl.edu.pwr.abis.domain.enums.StatusOceny;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.DiscriminatorType;

@Getter
@Setter
@Entity(name = "ocena")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",
    discriminatorType = DiscriminatorType.STRING)
public class Ocena {
    @Id
    private Long id;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
            "dataWystawienia_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
            "dataWystawienia_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
            "dataWystawienia_rok"))
        }
    )
    private Data dataWystawienia;

    @NotNull
    @Basic
    private double liczbaPunktow;

    @NotNull
    @Basic
    private String uzasadnienie;

    @NotNull
    @Enumerated
    private StatusOceny statusOceny = StatusOceny.WERSJA_ROBOCZA;

    @NotNull
    @Enumerated
    private KryteriumPEM kryteriumPem;
}