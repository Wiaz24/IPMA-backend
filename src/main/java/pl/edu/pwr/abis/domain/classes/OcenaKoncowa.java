package pl.edu.pwr.abis.domain.classes;


import jakarta.persistence.Basic;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("OcenaKoncowa")
public class OcenaKoncowa extends Ocena{

    @Basic
    private String uzasadnienieOdrzucenia;

    @OneToOne(optional = false)
    private Projekt projekt;
}
