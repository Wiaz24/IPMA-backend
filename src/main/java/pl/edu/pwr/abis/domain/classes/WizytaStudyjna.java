package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Data;

@Entity(name = "wizyta_studyjna")
@Getter
@Setter
public class WizytaStudyjna {
    @Id
    private Long id;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
            "termin_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
            "termin_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
            "termin_rok"))
        }
    )
    private Data termin;

    @OneToOne(optional = false)
    private Projekt projekt;

    @OneToOne(optional = true, mappedBy = "wizytaStudyjna")
    private RaportZWizytyStudyjnej raportZWizytyStudyjnej;

}
