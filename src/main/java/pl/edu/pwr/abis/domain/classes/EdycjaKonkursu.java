package pl.edu.pwr.abis.domain.classes;

import java.util.Set;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Data;
import pl.edu.pwr.abis.domain.dataTypes.Dokument;

@Entity(name = "edycja_konkursu")
@Getter
@Setter
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"numerEdycji"})})
public class EdycjaKonkursu {
    @Id
    private Long id;

    @Basic
    private static double kosztUczestnictwa;

    public double getKosztUczestnictwa() {
        return kosztUczestnictwa;
    }

    @Basic
    private long numerEdycji;

    @Basic
    boolean czyAktywna = false;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "dataZgloszeniaAplikacji_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "dataZgloszeniaAplikacji_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "dataZgloszeniaAplikacji_rok")),
        }
    )
    private Data dataZgloszeniaAplikacji;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "dataDostarczeniaRaportu_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "dataDostarczeniaRaportu_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "dataDostarczeniaRaportu_rok")),
        }
    )
    private Data dataDostarczeniaRaportu;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "dataOpracowaniaOcenyIndywidualnej_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "dataOpracowaniaOcenyIndywidualnej_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "dataOpracowaniaOcenyIndywidualnej_rok")),
        }
    )
    private Data dataOpracowaniaOcenyIndywidualnej;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "dataOpracowaniaOcenyWstepnej_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "dataOpracowaniaOcenyWstepnej_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "dataOpracowaniaOcenyWstepnej_rok")),
        }
    )
    private Data dataOpracowaniaOcenyWstepnej;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "dataOpracowaniaOcenyKoncowej_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "dataOpracowaniaOcenyKoncowej_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "dataOpracowaniaOcenyKoncowej_rok")),
        }
    )
    private Data dataOpracowaniaOcenyKoncowej;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "dataOpracowaniaRaportuWizyty_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "dataOpracowaniaRaportuWizyty_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "dataOpracowaniaRaportuWizyty_rok")),
        }
    )
    private Data dataOpracowaniaRaportuWizyty;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "dataWizytyStudyjnej_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "dataWizytyStudyjnej_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "dataWizytyStudyjnej_rok")),
        }
    )
    private Data dataWizytyStudyjnej;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "dzien", column = @Column(name =
                "terminUroczystocci_dzien")),
            @AttributeOverride(name = "miesiac", column = @Column(name =
                "terminUroczystocci_miesiac")),
            @AttributeOverride(name = "rok", column = @Column(name =
                "terminUroczystocci_rok")),
        }
    )
    private Data terminUroczystosci;

    @NotNull
    @Basic
    private String miejsceUroczystosci;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "format", column = @Column(name =
                "ulotkaPPEA_format")),
        }
    )
    private Dokument ulotkaPPEA;
    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "format", column = @Column(name =
                "regulamin_format")),
        }
    )
    private Dokument regulamin;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "format", column = @Column(name =
                "harmonogram_format")),
        }
    )
    private Dokument harmonogram;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "format", column = @Column(name =
                "listaFinalistow_format")),
        }
    )
    private Dokument listaFinalistow;

    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "format", column = @Column(name =
                "wyniki_format")),
        }
    )
    private Dokument wyniki;

    @OneToOne(optional = true, mappedBy = "edycjaKonkursu")
    private BiuroNagrody biuroNagrody;

    @OneToMany(mappedBy = "edycjaKonkursu")
    private Set<Webinarium> webinarium;

    @OneToOne(optional = true, mappedBy = "edycjaKonkursu")
    private JuryNagrody juryNagrody;

    @OneToMany(mappedBy = "edycjaKonkursu")
    private Set<WniosekAplikacyjny> wniosekAplikacyjny;
}
