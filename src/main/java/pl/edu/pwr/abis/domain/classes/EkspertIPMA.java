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
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.dataTypes.Organizacja;

@Entity(name = "ekspert_ipma")
@Getter
@Setter
public class EkspertIPMA {
    @Id
    private Long id;

    @NotNull
    @Embedded
    @AttributeOverrides(
        {
            @AttributeOverride(name = "nazwa", column = @Column(name =
            "organizacja_nazwa")),
            @AttributeOverride(name = "adres", column = @Column(name =
            "organizacja_adres")),
            @AttributeOverride(name = "NIP", column = @Column(name =
            "organizacja_NIP"))
        }
    )
    private Organizacja organizacja;

    @NotNull
    @Basic
    private String imie;

    @NotNull
    @Basic
    private String nazwisko;

    @NotNull
    @Basic
    private boolean doWeryfikacji = false;

    @OneToMany(mappedBy = "ekspertIPMA")
    private Set<Asesor> asesor;

    @OneToMany(mappedBy = "ekspertIPMA")
    private Set<Propozycja> propozycja;
}