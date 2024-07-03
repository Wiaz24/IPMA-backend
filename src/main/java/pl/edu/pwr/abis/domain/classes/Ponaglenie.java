package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Data;
import pl.edu.pwr.abis.domain.enums.PowodPonaglenia;

@Entity(name = "ponaglenie")
@Getter
@Setter
public class Ponaglenie {
    @Id
    private Long id;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
            "data_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
            "data_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
            "data_rok"))
        }
    )
    private Data data;

    @NotNull
    @Basic
    private String tresc;

    @NotNull
    @Basic
    private PowodPonaglenia powodPonaglenia;

    @ManyToOne(optional = false)
    private Asesor asesor;
}

