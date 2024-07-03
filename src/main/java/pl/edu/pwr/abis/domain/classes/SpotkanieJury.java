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

@Entity(name = "spotkanie_jury")
@Getter
@Setter
public class SpotkanieJury {
    @Id
    private Long id;

    @NotNull
    @Basic
    private String miejsceOrganizacji;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "termin_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "termin_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "termin_rok")),
        }
    )
    private Data termin;

    @ManyToOne(optional = false)
    private JuryNagrody juryNagrody;
}
