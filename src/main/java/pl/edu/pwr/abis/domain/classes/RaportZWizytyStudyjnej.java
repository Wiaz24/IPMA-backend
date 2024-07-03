package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Data;
import pl.edu.pwr.abis.domain.enums.StatusRaportu;

@Entity(name = "raport_z_wizyty_studyjnej")
@Getter
@Setter
public class RaportZWizytyStudyjnej {
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
    private String tresc;

    @NotNull
    @Enumerated
    private StatusRaportu statusRaportu;

    @OneToOne(optional = false)
    private WizytaStudyjna wizytaStudyjna;

}
