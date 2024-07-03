package pl.edu.pwr.abis.domain.classes;

import java.util.Set;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "asesor")
@Getter
@Setter
public class Asesor {
    @Id
    private Long id;

    @Basic
    private boolean czyWiodacy;

    @OneToMany(mappedBy = "asesor", cascade = CascadeType.REMOVE)
    private Set<Ponaglenie> classB4;

    @ManyToOne(optional = false)
    private EkspertIPMA ekspertIPMA;

    @OneToOne(optional = true, mappedBy = "asesor")
    private OcenaIndywidualna ocenaIndywidualna;

    @ManyToOne(optional = false)
    private Projekt projekt;

    @OneToOne(optional = true)
    private Projekt nadzorowanyProjekt;
}
