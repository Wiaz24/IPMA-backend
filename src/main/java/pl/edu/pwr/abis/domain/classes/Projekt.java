package pl.edu.pwr.abis.domain.classes;

import java.util.List;
import java.util.Set;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Data;
import pl.edu.pwr.abis.domain.enums.Kategoria;
import pl.edu.pwr.abis.domain.enums.StatusProjektu;

@Entity(name = "projekt")
@Getter
@Setter
public class Projekt {

    @Id
    private Long id;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
            "dataUkonczenia_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
            "dataUkonczenia_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
            "dataUkonczenia_rok"))
        }
    )
    private Data dataUkonczenia;

    @Enumerated
    private Kategoria kategoria;

    @NotNull
    @Enumerated
    private StatusProjektu statusProjektu;

    @OneToOne(optional = true, mappedBy = "projekt")
    private OcenaWstepna ocenaWstepna;

    @OneToOne(optional = true, mappedBy = "projekt")
    private OcenaKoncowa ocenaKoncowa;

    @OneToMany(mappedBy = "projekt")
    private List<Asesor> asesorzy;

    @OneToOne(optional = true, mappedBy = "nadzorowanyProjekt")
    private Asesor asesorWiodacy;

    @OneToMany(mappedBy = "projekt")
    private List<Propozycja> propozycje;

    @OneToOne(optional = true, mappedBy = "projekt")
    private Finalista finalista;

    @OneToOne(optional = true, mappedBy = "projekt")
    private WizytaStudyjna wizytaStudyjna;

    @OneToMany(mappedBy = "projekt")
    private Set<PytanieJuryDoProjektu> pytaniaJury;

    @OneToOne(optional = false, mappedBy = "projekt")
    private WniosekAplikacyjny wniosekAplikacyjny;
}
