package pl.edu.pwr.abis.domain.classes;

import java.util.Set;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "wniosek_aplikacyjny")
@Getter
@Setter
public class WniosekAplikacyjny {
    @Id
    private Long id;

    @NotNull
    @Basic
    private String nazwa_projektu;
    @Basic
    private Boolean czy_oplacony = false;

    @OneToMany(mappedBy = "wniosekAplikacyjny")
    private Set<RaportAplikacyjny> raportAplikacyjny;

    @OneToOne(optional = false)
    private Aplikant aplikant;

    @OneToOne(optional = false, cascade = CascadeType.REMOVE)
    private ZalacznikDoWnioskuAplikacyjnego zalacznikDoWnioskuAplikacyjnego;

    @ManyToOne(optional = false)
    private EdycjaKonkursu edycjaKonkursu;

    @OneToOne(optional = true)
    private Projekt projekt;

}
