package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
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
import pl.edu.pwr.abis.domain.enums.GrupaDocelowa;

@Entity(name = "webinarium")
@Getter
@Setter
public class Webinarium {

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
                "termin_rok")),
        }
    )
    private Data termin;

    @NotNull
    @Enumerated
    private GrupaDocelowa grupaDocelowa;

    @ManyToOne(optional = false)
    private EdycjaKonkursu edycjaKonkursu;

    @ManyToOne(optional = false)
    private Trener trener;
}
