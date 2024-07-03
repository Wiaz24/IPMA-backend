package pl.edu.pwr.abis.domain.classes;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("OcenaWstepna")
public class OcenaWstepna extends Ocena{

    @OneToOne(optional = false)
    private Projekt projekt;
}
